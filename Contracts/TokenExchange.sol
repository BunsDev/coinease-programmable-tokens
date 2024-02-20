pragma solidity ^0.8.0;

contract TokenExchange {
    address public owner;
    uint256 public constant revertWindow = 15 minutes; // Revert window period in seconds

    struct Order {
        uint256 orderId;
        address payable tokenProvider;
        uint256 tokensProvided; // Amount in Wei
        uint256 createdAt;
        bool claimed;
        bool reverted;
    }

    mapping(uint256 => Order) public orders;
    uint256 public orderCount;

    constructor() {
        owner = msg.sender;
        orderCount = 0;
    }

    modifier onlyOwner() {
        require(msg.sender == owner, "Only owner can call this function");
        _;
    }

    receive() external payable {}

    function addOrder(uint256 tokensProvidedInWei) external {
        orderCount++;
        orders[orderCount] = Order(orderCount, payable(msg.sender), tokensProvidedInWei, block.timestamp, false, false);
    }

    function releaseOrder(uint256 _orderId, address payable fiatProviderAddress) external onlyOwner {
        Order storage order = orders[_orderId];
        require(!order.claimed, "Order already claimed");
        fiatProviderAddress.transfer(order.tokensProvided);
        order.claimed = true;
    }

    function revertOrder(uint256 _orderId) external {
        Order storage order = orders[_orderId];
        require(msg.sender == order.tokenProvider, "Only token provider can revert this order");
        require(!order.claimed, "Order already claimed");
        require(!order.reverted, "Order already reverted");
        require(block.timestamp >= order.createdAt + revertWindow, "Revert window has not passed yet");
        order.tokenProvider.transfer(order.tokensProvided);
        order.reverted = true;
    }
}