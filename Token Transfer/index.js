const express = require('express');
const mongoose = require('mongoose');
const cron = require('node-cron');
require('dotenv').config();
const { Web3 } = require('web3');
const axios = require('axios');
const  contractABI = require('./contractABI.json');
const app = express();
const bodyParser = require('body-parser');
const Tx = require('ethereumjs-tx').Transaction
const PORT = process.env.PORT || 3000;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

// Connect to MongoDB
const MONGODB_URI = process.env.MONGODB_URI;

mongoose.connect(MONGODB_URI, {
    useNewUrlParser: true,
    useUnifiedTopology: true,
});

const db = mongoose.connection;
db.on('error', console.error.bind(console, 'MongoDB connection error:'));
db.once('open', () => {
    console.log('Connected to MongoDB');
});

const authHeader = {
    username: process.env.razorpay_username,
    password: process.env.razorpay_password
};

// const adminPrivateKey = process.env.ADMIN_PRIVATE_KEY;

// const web3 = new Web3('https://avalanche-fuji.infura.io/v3/39b2abffe10e4659a12074ce9a344bae');
const web3 = new Web3('https://polygon-mumbai.infura.io/v3/39b2abffe10e4659a12074ce9a344bae');


// Use the private key to sign transactions
// const adminAccount = web3.eth.accounts.privateKeyToAccount(adminPrivateKey);
// const adminAddress = adminAccount.address;
// console.log(adminAccount)
// console.log(adminAddress)

const contractAddress = "0xAE64136B8488675362dDc03203F7567E865f23F8";
const contractInstance = new web3.eth.Contract(contractABI, contractAddress);

// Order schema
const orderSchema = new mongoose.Schema({
    orderId: Number,
    fiatAmountAsked: Number,
    tokenProviderEmail: String,
    tokenProviderName: String, // Adding tokenProviderName field
    tokenProviderBankDetails: {
        name: String,
        ifsc: String,
        account_number: String
    },
    fiatProviderEmail: String,
    fiatProviderWalletAddress: String,
    orderCompleted: Boolean
});
const Order = mongoose.model('Order', orderSchema);

async function getCurrentOrderCountFromContract() {
    try {
        const currentOrderCount = await contractInstance.methods.orderCount().call();
        return currentOrderCount;
    } catch (error) {
        console.error('Error getting current order count from contract:', error);
        throw error;
    }
}

// Endpoint to create an order and store tokenProvider's bank details
app.post('/createOrder', async (req, res) => {
    const { tokenProviderEmail, tokenProviderName, tokenProviderBankDetails, fiatAmountAsked } = req.body;
    try {
        // Save tokenProvider's details in the order schema
        const currentOrderCount = await getCurrentOrderCountFromContract();
        console.log("Current order count: ", currentOrderCount);
        // Generate orderId based on current order count
        const orderId = Number(currentOrderCount) + 1; // You can adjust this based on your requirements
        console.log("Order ID: ", orderId);
        // Save tokenProvider's details in the order schema
        const order = new Order({
            orderId,
            fiatAmountAsked,
            tokenProviderEmail,
            tokenProviderName,
            tokenProviderBankDetails,
            orderCompleted: false,
            fiatDetailsAdded: false
        });
        await order.save();
        res.status(201).send('Order created successfully');
    } catch (error) {
        console.error(error);
        res.status(500).send('Error creating order');
    }
});


// Endpoint to add fiat provider details to an existing order
app.post('/addFiatProviderDetails/:orderId', async (req, res) => {
    const { fiatProviderEmail, fiatProviderWalletAddress } = req.body;
    const { orderId } = req.params;
    try {
        // Find the order by orderId and update fiat provider details
        const order = await Order.findOneAndUpdate({ orderId }, { fiatProviderEmail, fiatProviderWalletAddress,fiatDetailsAdded:true }, { new: true });
        if (!order) {
            return res.status(404).send('Order not found');
        }
        res.status(200).send('Fiat provider details added successfully');
    } catch (error) {
        console.error(error);
        res.status(500).send('Error adding fiat provider details');
    }
});

// Endpoint to get all orders from the smart contract
app.get('/getActiveOrders', async (req, res) => {
    try {
        // Query the database for incomplete orders
        const incompleteOrders = await Order.find({ orderCompleted: false });

        // Send the response with the incomplete orders
        res.json(incompleteOrders);
    } catch (error) {
        // Handle errors
        console.error('Error getting incomplete orders:', error);
        res.status(500).json({ message: 'Internal server error' });
    }
});

app.get('/getAllOrders', async (req, res) => {
    try {
        // Query the database for all orders
        const allOrders = await Order.find();

        // Send the response with the all orders
        res.json(allOrders);
    } catch (error) {
        // Handle errors
        console.error('Error getting all orders:', error);
        res.status(500).json({ message: 'Internal server error' });
    }
});

// Define the cron job to run every minute
cron.schedule('* * * * *', async () => {
    try {
        // Logic to process each order
        console.log("Listening for payments...");
        const orders = await Order.find({});
        const response = await axios.get("https://api.razorpay.com/v1/payments/", { auth: authHeader });
        for (const order of orders) {
            // Check if the order is incomplete
            if (!order.orderCompleted) {
                console.log("Processing order ID: ", order.orderId);
                // Iterate over the payments in the response
                let latestPayment;
                for (const payment of response.data.items) {
                    // Match fiatProviderEmail from order with email in the response body
                    if (payment.email === order.fiatProviderEmail) {
                        // Check if the payment is more recent than the previous one
                        if (!latestPayment || payment.created_at > latestPayment.created_at) {
                            latestPayment = payment;
                        }
                    }
                }
                // Check if a matching payment was found
                if (latestPayment) {
                    // Check if the payment is "captured"
                    if (latestPayment.status === "captured") {
                        // Call release token function in the contract
                        console.log(latestPayment)
                        console.log("Payment captured for order ID: ", order.orderId);
                        // var privateKey = Buffer.from(process.env.PRIVATE_KEY, 'hex');

                        // const myData = contractInstance.methods.releaseOrder(order.orderId,order.fiatProviderWalletAddress).encodeABI();
                        // var nonce = web3.eth.getTransactionCount(adminAddress)
                        // // Build the transaction
                        // const txObject = {
                        //     nonce:    web3.utils.toHex(nonce),
                        //     to:       contractAddress,
                        //     value:    web3.utils.toHex(web3.utils.toWei('0', 'ether')),
                        //     gasLimit: web3.utils.toHex(1),
                        //     gasPrice: web3.utils.toHex(web3.utils.toWei('1', 'gwei')),
                        //     data: myData,
                        //     chainId: 80001
                        // }
                        //     // Sign the transaction
                        //     const tx = new Tx(txObject);
                        //     tx.sign(privateKey);

                        //     const serializedTx = tx.serialize();
                        //     const raw = '0x' + serializedTx.toString('hex');

                        //     web3.eth.sendSignedTransaction(serializedTx);

                            // Broadcast the transaction
                            // const transaction = web3.eth.sendSignedTransaction(raw, (err, tx) => {
                            //     console.log(tx)
                            // });   
                    
                        // await contractInstance.methods.releaseOrder(order.orderId,order.fiatProviderWalletAddress).send({ from: adminAddress });
                        
                        // Call the Razorpay contacts API to create a contact
                        const contactResponse = await axios.post("https://api.razorpay.com/v1/contacts", {
                            name: order.tokenProviderName, // Using tokenProviderName from the order
                            email: order.fiatProviderEmail
                        }, { auth: authHeader });
                        console.log("Line 216");
                        const contactId = contactResponse.data.id;
                        console.log("Contact ID:", contactId);
                        
                        // Get bank account details from the database (use updated bank account schema)
                        const bankAccountDetails = order.tokenProviderBankDetails;
                        // Call the Razorpay fund_accounts API to create a bank account
                        const fundAccountResponse = await axios.post("https://api.razorpay.com/v1/fund_accounts", {
                            contact_id: contactId,
                            account_type: "bank_account",
                            bank_account: bankAccountDetails
                        }, { auth: authHeader });
                        const fundAccountId = fundAccountResponse.data.id;
                        console.log("Fund account ID:", fundAccountId);
                        console.log(bankAccountDetails.account_number);
                        console.log(order.fiatAmountAsked);
                        
                        // Call the Razorpay payouts API to initiate a payout
                        const payoutResponse = await axios.post("https://api.razorpay.com/v1/payouts", {
                            account_number: "2323230062416175",
                            fund_account_id: fundAccountId,
                            amount: order.fiatAmountAsked, // Using fiatAmountAsked from the order
                            currency: "INR",
                            mode: "IMPS",
                            purpose: "refund",
                            queue_if_low_balance: true
                        }, { auth: authHeader });
                        console.log("Payout initiated:", payoutResponse.data);
                        // Mark order as completed
                        order.orderCompleted = true;
                        await order.save();
                        console.log(`Order ID: ${order.orderId} marked as completed.`);
                    }
                }
            }
        }
    } catch (error) {
        console.error('Error processing orders:', error);
    }
});


app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
