# How to run

# Vision
Onboarding new users to crypto/web3 ecosystem

# Description
CoinEase: Blockchain/Web3 Crypto App with Particle Network Integration

# Our project aims to provide a user-friendly and secure platform for individuals entering the web3 ecosystem. Leveraging the Particle Network for seamless onboarding through various authentication methods such as Google accounts, phone numbers, and social media accounts, we empower beginners to engage with blockchain technology effortlessly.

# Key Features:

Escrow Service with Cross-Chain Functionality: Our app offers an escrow service allowing users to securely transfer funds within the same blockchain or across different blockchains. This feature is particularly beneficial for beginners who may inadvertently send tokens to incorrect addresses. Users can revert their transactions before they are claimed by the receiver, mitigating the risk of irreversible mistakes. Additionally, we have implemented QR code-based token transfers, which are cross-chain enabled through Chainlink CCIP. This abstraction simplifies the process for users, eliminating the need to determine the specific blockchain and enabling seamless token transfers.

Trustless Buy/Sell Crypto with Fiat: To facilitate the acquisition of native tokens for users onboarded via Particle Network, our platform offers a trustless buy/sell crypto service using fiat currency. Users can easily purchase native tokens from their bank accounts, providing a seamless transition into the world of cryptocurrencies. Here's how it works:

Seller (Bob) Creates Order: Bob initiates an order by locking his tokens in the smart contract, indicating his intention to sell.
Buyer (Alice) Places Order: Alice browses through the available orders and chooses to buy tokens from Bob. She confirms the transaction, becoming the sender.
Payment Verification: Alice proceeds to make the payment through a payment gateway like Razorpay. Our system verifies the completion of the payment via the Razorpay API backend.
Token Release: Upon successful payment verification, the corresponding tokens are automatically released to Alice's wallet address.
Reversion Mechanism: If Alice fails to complete the payment within the specified timeframe (e.g., 15 minutes), Bob's tokens are reverted back to him. This ensures fairness and prevents potential losses for the seller.
Automated and Trustless Process: Unlike traditional exchanges where transactions rely on manual confirmation from both parties, our platform operates on a fully automated and trustless basis. Transactions are executed seamlessly without the need for user intervention, providing a hassle-free experience for both buyers and sellers.

Conclusion: By integrating the Particle Network for user onboarding and implementing advanced features such as escrow services and trustless buy/sell crypto with fiat, our blockchain/web3 crypto app aims to democratize access to cryptocurrencies and streamline the user experience for newcomers. We prioritize security, automation, and simplicity to empower individuals entering the web3 ecosystem, driving widespread adoption and innovation in the decentralized finance (DeFi) space.
