// SPDX-License-Identifier: MIT
pragma solidity 0.8.20;

import {IRouterClient} from "@chainlink/contracts-ccip/src/v0.8/ccip/interfaces/IRouterClient.sol";
import {OwnerIsCreator} from "@chainlink/contracts-ccip/src/v0.8/shared/access/OwnerIsCreator.sol";
import {Client} from "@chainlink/contracts-ccip/src/v0.8/ccip/libraries/Client.sol";
import {CCIPReceiver} from "@chainlink/contracts-ccip/src/v0.8/ccip/applications/CCIPReceiver.sol";
import {IERC20} from "@chainlink/contracts-ccip/src/v0.8/vendor/openzeppelin-solidity/v4.8.0/contracts/token/ERC20/IERC20.sol";
import {Strings} from "@openzeppelin/contracts/utils/Strings.sol";



/// @title - A simple messenger contract for transferring/receiving tokens and data across chains.
contract ProgrammableTokenTransfers is CCIPReceiver, OwnerIsCreator {
    // Custom errors to provide more descriptive revert messages.
    error NotEnoughBalance(uint256 currentBalance, uint256 calculatedFees); // Used to make sure contract has enough balance to cover the fees.
    error NothingToWithdraw(); // Used when trying to withdraw Ether but there's nothing to withdraw.
    error FailedToWithdrawEth(address owner, address target, uint256 value); // Used when the withdrawal of Ether fails.
    error DestinationChainNotAllowed(uint64 destinationChainSelector); // Used when the destination chain has not been allowlisted by the contract owner.
    error SourceChainNotAllowed(uint64 sourceChainSelector); // Used when the source chain has not been allowlisted by the contract owner.
    error SenderNotAllowed(address sender); // Used when the sender has not been allowlisted by the contract owner.
    error InvalidReceiverAddress(); // Used when the receiver address is 0.

    // Event emitted when a message is sent to another chain.
    event MessageSent(
        bytes32 indexed messageId, // The unique ID of the CCIP message.
        uint64 indexed destinationChainSelector, // The chain selector of the destination chain.
        address receiver, // The address of the receiver on the destination chain.
        string text, // The text being sent.
        address token, // The token address that was transferred.
        uint256 tokenAmount, // The token amount that was transferred.
        address feeToken, // the token address used to pay CCIP fees.
        uint256 fees // The fees paid for sending the message.
    );

    // Event emitted when a message is received from another chain.
    event MessageReceived(
        bytes32 indexed messageId, // The unique ID of the CCIP message.
        uint64 indexed sourceChainSelector, // The chain selector of the source chain.
        address sender, // The address of the sender from the source chain.
        string text, // The text that was received.
        address token, // The token address that was transferred.
        uint256 tokenAmount // The token amount that was transferred.
    );

    bytes32 private s_lastReceivedMessageId; // Store the last received messageId.
    address private s_lastReceivedTokenAddress; // Store the last received token address.
    uint256 private s_lastReceivedTokenAmount; // Store the last received amount.
    string private s_lastReceivedText; // Store the last received text.

    // Mapping to keep track of allowlisted destination chains.
    mapping(uint64 => bool) public allowlistedDestinationChains;

    // Mapping to keep track of allowlisted source chains.
    mapping(uint64 => bool) public allowlistedSourceChains;

    // Mapping to keep track of allowlisted senders.
    mapping(address => bool) public allowlistedSenders;

    IERC20 private s_linkToken;

    /// @notice Constructor initializes the contract with the router address.
    /// @param _router The address of the router contract.
    /// @param _link The address of the link contract.
    constructor(address _router, address _link) CCIPReceiver(_router) {
        s_linkToken = IERC20(_link);
    }

    /// @dev Modifier that checks if the chain with the given destinationChainSelector is allowlisted.
    /// @param _destinationChainSelector The selector of the destination chain.
    modifier onlyAllowlistedDestinationChain(uint64 _destinationChainSelector) {
        if (!allowlistedDestinationChains[_destinationChainSelector])
            revert DestinationChainNotAllowed(_destinationChainSelector);
        _;
    }

    /// @dev Modifier that checks the receiver address is not 0.
    /// @param _receiver The receiver address.
    modifier validateReceiver(address _receiver) {
        if (_receiver == address(0)) revert InvalidReceiverAddress();
        _;
    }

    /// @dev Modifier that checks if the chain with the given sourceChainSelector is allowlisted and if the sender is allowlisted.
    /// @param _sourceChainSelector The selector of the destination chain.
    /// @param _sender The address of the sender.
    modifier onlyAllowlisted(uint64 _sourceChainSelector, address _sender) {
        if (!allowlistedSourceChains[_sourceChainSelector])
            revert SourceChainNotAllowed(_sourceChainSelector);
        if (!allowlistedSenders[_sender]) revert SenderNotAllowed(_sender);
        _;
    }

    /// @dev Updates the allowlist status of a destination chain for transactions.
    /// @notice This function can only be called by the owner.
    /// @param _destinationChainSelector The selector of the destination chain to be updated.
    /// @param allowed The allowlist status to be set for the destination chain.
    function allowlistDestinationChain(
        uint64 _destinationChainSelector,
        bool allowed
    ) external onlyOwner {
        allowlistedDestinationChains[_destinationChainSelector] = allowed;
    }

    /// @dev Updates the allowlist status of a source chain
    /// @notice This function can only be called by the owner.
    /// @param _sourceChainSelector The selector of the source chain to be updated.
    /// @param allowed The allowlist status to be set for the source chain.
    function allowlistSourceChain(
        uint64 _sourceChainSelector,
        bool allowed
    ) external onlyOwner {
        allowlistedSourceChains[_sourceChainSelector] = allowed;
    }

    /// @dev Updates the allowlist status of a sender for transactions.
    /// @notice This function can only be called by the owner.
    /// @param _sender The address of the sender to be updated.
    /// @param allowed The allowlist status to be set for the sender.
    function allowlistSender(address _sender, bool allowed) external onlyOwner {
        allowlistedSenders[_sender] = allowed;
    }

     struct Payment {
        address sender;
        address receiver;
        address tokenAddress;
        uint256 amount;
        uint256 deadline;
        bool claimed;
        bool reverted;
        uint256 paymentId;
    }

    mapping(address => mapping(uint256 => Payment)) public sentPayments;
    mapping(address => mapping(uint256 => Payment)) public receivedPayments;
    
    Payment[] public payments;
    uint256 public currPaymentId = 0;

    event PaymentInitiated(uint256 payId, address sender, address receiver,address tokenAddress,uint256 amount, uint256 deadline);
    event PaymentClaimed(uint256 payId, address sender, address receiver,address tokenAddress, uint256 amount);
    event PaymentReverted(uint256 payId, address sender, address receiver,address tokenAddress, uint256 amount);

    // address USDCtoken = 0x5425890298aed601595a70AB815c96711a31Bc65;

    function sendPayment(address _receiver, uint256 _amount, uint256 _timeAhead,address _tokenAddress) external {
        require(msg.sender != _receiver, "Sender and receiver cannot be the same");
        uint256 deadline = block.timestamp + _timeAhead;
        require(deadline > block.timestamp, "Deadline must be in the future");
        require(_amount > 0, "Payment amount must be greater than zero");

        currPaymentId++;
        Payment memory payment = Payment(msg.sender, _receiver, _tokenAddress, _amount,deadline, false, false, currPaymentId);
        sentPayments[msg.sender][currPaymentId] = payment;
        receivedPayments[_receiver][currPaymentId] = payment;
        IERC20 token = IERC20(_tokenAddress);//address of USDC on this chain
        //sender will have to first give allowance to contract
        token.transferFrom(msg.sender, address(this), _amount);

        payments.push(payment);
        emit PaymentInitiated(currPaymentId, msg.sender, _receiver, _tokenAddress,_amount, deadline);
    }

    function revertPayment(uint256 _paymentId) external {
        Payment storage payment = sentPayments[msg.sender][_paymentId];
        require(payment.sender == msg.sender, "Sender can only revert their own payments");
        require(!payment.claimed, "Payment has already been claimed");
        require(!payment.reverted, "Payment has already been reverted");

        payment.reverted = true;
        payments[_paymentId - 1].reverted = true;

        IERC20 token = IERC20(payment.tokenAddress);//address of USDC on this chain
        token.transfer(payment.sender, payment.amount);

        emit PaymentReverted(_paymentId, payment.sender, payment.receiver,payment.tokenAddress, payment.amount);
    }

    function calculateOverheadFee(
        uint256 _paymentId,
        uint64 _destinationChainSelector,
        address deployedReceivingContract,
        string calldata _receivingAddress
    ) 
        public 
        view 
        returns (uint256 overheadFee){
        Payment storage payment = receivedPayments[msg.sender][_paymentId];
        
        uint256 amount = payment.amount;
        // Create an EVM2AnyMessage struct in memory with necessary information for sending a cross-chain message
        // address(0) means fees are paid in native gas
        // string calldata text="";

        Client.EVM2AnyMessage memory evm2AnyMessage = _buildCCIPMessage(
            deployedReceivingContract,
            _receivingAddress,
            payment.tokenAddress,
            amount,
            address(0)
        );

        IRouterClient router = IRouterClient(this.getRouter());

        // Get the fee required to send the CCIP message
        uint256 fees = router.getFee(_destinationChainSelector, evm2AnyMessage);
        return fees;
    }

    
    //claim payment
    function sendMessagePayNative(
        uint256 _paymentId,
        uint64 _destinationChainSelector,
        address deployedReceivingContract,
        string calldata _receivingAddress
    )
        external
        // onlyAllowlistedDestinationChain(_destinationChainSelector)
        returns (bytes32 messageId)
    {   


        Payment storage payment = receivedPayments[msg.sender][_paymentId];
        Payment storage payment_sender = sentPayments[payment.sender][_paymentId];
            require(payment.receiver == msg.sender, "Receiver can only claim the payment");
            require(!payment.claimed, "Payment has already been claimed");
            require(!payment.reverted, "Payment has been reverted by the sender");
            require(block.timestamp <= payment.deadline, "Payment deadline has passed");

            uint256 amount = payment.amount;
        // Create an EVM2AnyMessage struct in memory with necessary information for sending a cross-chain message
        // address(0) means fees are paid in native gas

        Client.EVM2AnyMessage memory evm2AnyMessage = _buildCCIPMessage(
            deployedReceivingContract,
            _receivingAddress,
            payment.tokenAddress,
            amount,
            address(0)
        );

        // Initialize a router client instance to interact with cross-chain router
        IRouterClient router = IRouterClient(this.getRouter());

        // Get the fee required to send the CCIP message
        uint256 fees = router.getFee(_destinationChainSelector, evm2AnyMessage);

        if (fees > address(this).balance)
            revert NotEnoughBalance(address(this).balance, fees);

        // approve the Router to spend tokens on contract's behalf. It will spend the amount of the given token
        IERC20(payment.tokenAddress).approve(address(router), amount);

        // Send the message through the router and store the returned message ID
        messageId = router.ccipSend{value: fees}(
            _destinationChainSelector,
            evm2AnyMessage
        );

        // Emit an event with message details
        emit MessageSent(
            messageId,
            _destinationChainSelector,
            deployedReceivingContract,
            _receivingAddress,
            payment.tokenAddress,
            amount,
            address(0),
            fees
        );

        payment.claimed = true;
        payment_sender.claimed = true;
        payments[_paymentId - 1].claimed = true;
        emit PaymentClaimed(_paymentId, payment.sender, payment.receiver,payment.tokenAddress,payment.amount);

        // Return the message ID
        return messageId;
    }

     function sendMessagePayLINK(
        uint256 _paymentId,
        uint64 _destinationChainSelector,
        address deployedReceivingContract,
        string calldata _receivingAddress
    )
        external
        returns (bytes32 messageId)
    {     

        Payment storage payment = receivedPayments[mfpaysg.sender][_paymentId];
        Payment storage payment_sender = sentPayments[payment.sender][_paymentId];
        require(payment.receiver == msg.sender, "Receiver can only claim the payment");
        require(!payment.claimed, "Payment has already been claimed");
        require(!payment.reverted, "Payment has been reverted by the sender");
        require(block.timestamp <= payment.deadline, "Payment deadline has passed");

        uint256 amount = payment.amount;

        // Create an EVM2AnyMessage struct in memory with necessary information for sending a cross-chain message
        // address(linkToken) means fees are paid in LINK

        Client.EVM2AnyMessage memory evm2AnyMessage = _buildCCIPMessage(
            deployedReceivingContract,
            _receivingAddress,
            payment.tokenAddress,
            amount,
            address(s_linkToken)
        );

        // Initialize a router client instance to interact with cross-chain router
        IRouterClient router = IRouterClient(this.getRouter());

        // Get the fee required to send the CCIP message
        uint256 fees = router.getFee(_destinationChainSelector, evm2AnyMessage);

        if (fees > s_linkToken.balanceOf(address(this)))
            revert NotEnoughBalance(s_linkToken.balanceOf(address(this)), fees);

        // approve the Router to transfer LINK tokens on contract's behalf. It will spend the fees in LINK
        s_linkToken.approve(address(router), fees);

        // approve the Router to spend tokens on contract's behalf. It will spend the amount of the given token
        IERC20(payment.tokenAddress).approve(address(router), amount);

        // Send the message through the router and store the returned message ID
        messageId = router.ccipSend(_destinationChainSelector, evm2AnyMessage);

        // Emit an event with message details
        emit MessageSent(
            messageId,
            _destinationChainSelector,
            deployedReceivingContract,
            _receivingAddress,
            payment.tokenAddress,
            amount,
            address(s_linkToken),
            fees
        );
        payment.claimed = true;
        payment_sender.claimed = true;
        payments[_paymentId - 1].claimed = true;
        emit PaymentClaimed(_paymentId, payment.sender, payment.receiver,payment.tokenAddress,payment.amount);
        // Return the message ID
        return messageId;
    }

    function getSentPayments(address _sender) external view returns (Payment[] memory) {
        Payment[] memory result = new Payment[](currPaymentId);
        uint256 count = 0;
        for (uint256 i = 1; i <= currPaymentId; i++) {
            if (sentPayments[_sender][i].sender == _sender) {
                result[count] = sentPayments[_sender][i];
                count++;
            }
        }
        return result;
    }

       function getReceivedPayments(address _receiver) external view returns (Payment[] memory) {
        Payment[] memory result = new Payment[](currPaymentId);
        uint256 count = 0;
        for (uint256 i = 1; i <= currPaymentId; i++) {
            if (receivedPayments[_receiver][i].receiver == _receiver) {
                result[count] = receivedPayments[_receiver][i];
                count++;
            }
        }
        return result;
    }

    /**
     * @notice Returns the details of the last CCIP received message.
     * @dev This function retrieves the ID, text, token address, and token amount of the last received CCIP message.
     * @return messageId The ID of the last received CCIP message.
     * @return text The text of the last received CCIP message.
     * @return tokenAddress The address of the token in the last CCIP received message.
     * @return tokenAmount The amount of the token in the last CCIP received message.
     */
    function getLastReceivedMessageDetails()
        public
        view
        returns (
            bytes32 messageId,
            string memory text,
            address tokenAddress,
            uint256 tokenAmount
        )
    {
        return (
            s_lastReceivedMessageId,
            s_lastReceivedText,
            s_lastReceivedTokenAddress,
            s_lastReceivedTokenAmount
        );
    }

    /// handle a received message
    function _ccipReceive(
        Client.Any2EVMMessage memory any2EvmMessage
    )
        internal
        override
    {
        s_lastReceivedMessageId = any2EvmMessage.messageId; // fetch the messageId
        s_lastReceivedText = abi.decode(any2EvmMessage.data, (string)); // abi-decoding of the sent text
        // Expect one token to be transferred at once, but you can transfer several tokens.
        s_lastReceivedTokenAddress = any2EvmMessage.destTokenAmounts[0].token;
        s_lastReceivedTokenAmount = any2EvmMessage.destTokenAmounts[0].amount;

        // address receiver = abi.decode(payload, (address));
        address receiver = toAddress(s_lastReceivedText);
        IERC20(s_lastReceivedTokenAddress).transfer(receiver, s_lastReceivedTokenAmount);

        emit MessageReceived(
            any2EvmMessage.messageId,
            any2EvmMessage.sourceChainSelector, // fetch the source chain identifier (aka selector)
            abi.decode(any2EvmMessage.sender, (address)), // abi-decoding of the sender address,
            abi.decode(any2EvmMessage.data, (string)),
            any2EvmMessage.destTokenAmounts[0].token,
            any2EvmMessage.destTokenAmounts[0].amount
        );
    }

    /// @notice Construct a CCIP message.
    /// @dev This function will create an EVM2AnyMessage struct with all the necessary information for programmable tokens transfer.
    /// @param _receiver The address of the receiver.
    /// @param _receivingAddress The string data to be sent.
    /// @param _token The token to be transferred.
    /// @param _amount The amount of the token to be transferred.
    /// @param _feeTokenAddress The address of the token used for fees. Set address(0) for native gas.
    /// @return Client.EVM2AnyMessage Returns an EVM2AnyMessage struct which contains information for sending a CCIP message.
    function _buildCCIPMessage(
        address _receiver,
        string calldata _receivingAddress,
        address _token,
        uint256 _amount,
        address _feeTokenAddress
    ) internal pure returns (Client.EVM2AnyMessage memory) {
        // Set the token amounts
        Client.EVMTokenAmount[]
            memory tokenAmounts = new Client.EVMTokenAmount[](1);
        tokenAmounts[0] = Client.EVMTokenAmount({
            token: _token,
            amount: _amount
        });
        // Create an EVM2AnyMessage struct in memory with necessary information for sending a cross-chain message
        return
            Client.EVM2AnyMessage({
                receiver: abi.encode(_receiver), // ABI-encoded receiver address
                data: abi.encode(_receivingAddress), // ABI-encoded string
                tokenAmounts: tokenAmounts, // The amount and type of token being transferred
                extraArgs: Client._argsToBytes(
                    // Additional arguments, setting gas limit
                    Client.EVMExtraArgsV1({gasLimit: 200_000})
                ),
                // Set the feeToken to a feeTokenAddress, indicating specific asset will be used for fees
                feeToken: _feeTokenAddress
            });
    }

    /// @notice Fallback function to allow the contract to receive Ether.
    /// @dev This function has no function body, making it a default function for receiving Ether.
    /// It is automatically called when Ether is sent to the contract without any data.
    receive() external payable {}

    /// @notice Allows the contract owner to withdraw the entire balance of Ether from the contract.
    /// @dev This function reverts if there are no funds to withdraw or if the transfer fails.
    /// It should only be callable by the owner of the contract.
    /// @param _beneficiary The address to which the Ether should be sent.
    function withdraw(address _beneficiary) public onlyOwner {
        // Retrieve the balance of this contract
        uint256 amount = address(this).balance;

        // Revert if there is nothing to withdraw
        if (amount == 0) revert NothingToWithdraw();

        // Attempt to send the funds, capturing the success status and discarding any return data
        (bool sent, ) = _beneficiary.call{value: amount}("");

        // Revert if the send failed, with information about the attempted transfer
        if (!sent) revert FailedToWithdrawEth(msg.sender, _beneficiary, amount);
    }

    /// @notice Allows the owner of the contract to withdraw all tokens of a specific ERC20 token.
    /// @dev This function reverts with a 'NothingToWithdraw' error if there are no tokens to withdraw.
    /// @param _beneficiary The address to which the tokens will be sent.
    /// @param _token The contract address of the ERC20 token to be withdrawn.
    function withdrawToken(
        address _beneficiary,
        address _token
    ) public onlyOwner {
        // Retrieve the balance of this contract
        uint256 amount = IERC20(_token).balanceOf(address(this));

        // Revert if there is nothing to withdraw
        if (amount == 0) revert NothingToWithdraw();

        IERC20(_token).transfer(_beneficiary, amount);
    }

    function toAddress(string memory s) pure public returns (address) {
        bytes memory _bytes = hexStringToAddress(s);
        require(_bytes.length >= 1 + 20, "toAddress_outOfBounds");
        address tempAddress;

        assembly {
            tempAddress := div(mload(add(add(_bytes, 0x20), 1)), 0x1000000000000000000000000)
        }

        return tempAddress;
    }

     function hexStringToAddress(string memory s) pure public  returns (bytes memory) {
        bytes memory ss = bytes(s);
        require(ss.length%2 == 0); // length must be even
        bytes memory r = new bytes(ss.length/2);
        for (uint i=0; i<ss.length/2; ++i) {
            r[i] = bytes1(fromHexChar(uint8(ss[2*i])) * 16 +
                        fromHexChar(uint8(ss[2*i+1])));
        }

        return r;

    }

     function fromHexChar(uint8 c) pure public returns (uint8) {
        if (bytes1(c) >= bytes1('0') && bytes1(c) <= bytes1('9')) {
            return c - uint8(bytes1('0'));
        }
        if (bytes1(c) >= bytes1('a') && bytes1(c) <= bytes1('f')) {
            return 10 + c - uint8(bytes1('a'));
        }
        if (bytes1(c) >= bytes1('A') && bytes1(c) <= bytes1('F')) {
            return 10 + c - uint8(bytes1('A'));
        }
        return 0;
    }
}