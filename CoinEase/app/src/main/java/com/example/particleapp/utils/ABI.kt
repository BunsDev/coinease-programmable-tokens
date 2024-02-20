package com.example.particleapp.utils

object ABI {
    const val SAME_CHAIN_CONTRACT_ABI = "[\n" +
            "\t{\n" +
            "\t\t\"anonymous\": false,\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"payId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"PaymentClaimed\",\n" +
            "\t\t\"type\": \"event\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"anonymous\": false,\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"payId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"deadline\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"PaymentInitiated\",\n" +
            "\t\t\"type\": \"event\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"anonymous\": false,\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"payId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"indexed\": false,\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"PaymentReverted\",\n" +
            "\t\t\"type\": \"event\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"_paymentId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"claimPayment\",\n" +
            "\t\t\"outputs\": [],\n" +
            "\t\t\"stateMutability\": \"nonpayable\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [],\n" +
            "\t\t\"name\": \"currPaymentId\",\n" +
            "\t\t\"outputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"stateMutability\": \"view\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"_receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"getReceivedPayments\",\n" +
            "\t\t\"outputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"components\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\t\t\"name\": \"deadline\",\n" +
            "\t\t\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\t\t\"name\": \"claimed\",\n" +
            "\t\t\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\t\t\"name\": \"reverted\",\n" +
            "\t\t\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\t\t\"name\": \"paymentId\",\n" +
            "\t\t\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t],\n" +
            "\t\t\t\t\"internalType\": \"struct ETHEscrow.Payment[]\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"tuple[]\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"stateMutability\": \"view\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"_sender\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"getSentPayments\",\n" +
            "\t\t\"outputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"components\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\t\t\"name\": \"deadline\",\n" +
            "\t\t\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\t\t\"name\": \"claimed\",\n" +
            "\t\t\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\t\t\"name\": \"reverted\",\n" +
            "\t\t\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\t\t\"name\": \"paymentId\",\n" +
            "\t\t\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t],\n" +
            "\t\t\t\t\"internalType\": \"struct ETHEscrow.Payment[]\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"tuple[]\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"stateMutability\": \"view\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"payments\",\n" +
            "\t\t\"outputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"deadline\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\"name\": \"claimed\",\n" +
            "\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\"name\": \"reverted\",\n" +
            "\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"paymentId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"stateMutability\": \"view\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"receivedPayments\",\n" +
            "\t\t\"outputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"deadline\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\"name\": \"claimed\",\n" +
            "\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\"name\": \"reverted\",\n" +
            "\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"paymentId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"stateMutability\": \"view\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"_paymentId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"revertPayment\",\n" +
            "\t\t\"outputs\": [],\n" +
            "\t\t\"stateMutability\": \"nonpayable\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\"name\": \"_receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"_timeAhead\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"sendPayment\",\n" +
            "\t\t\"outputs\": [],\n" +
            "\t\t\"stateMutability\": \"payable\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"inputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"name\": \"sentPayments\",\n" +
            "\t\t\"outputs\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\"name\": \"sender\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"address payable\",\n" +
            "\t\t\t\t\"name\": \"receiver\",\n" +
            "\t\t\t\t\"type\": \"address\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"amount\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"deadline\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\"name\": \"claimed\",\n" +
            "\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"bool\",\n" +
            "\t\t\t\t\"name\": \"reverted\",\n" +
            "\t\t\t\t\"type\": \"bool\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"internalType\": \"uint256\",\n" +
            "\t\t\t\t\"name\": \"paymentId\",\n" +
            "\t\t\t\t\"type\": \"uint256\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"stateMutability\": \"view\",\n" +
            "\t\t\"type\": \"function\"\n" +
            "\t}\n" +
            "]"

    val CROSS_CHAIN_CONTRACT_ABI = "\"[\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_router\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_link\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"constructor\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"destinationChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"DestinationChainNotAllowed\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"owner\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"target\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"value\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"FailedToWithdrawEth\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [],\\r\\n\\t\\t\\\"name\\\": \\\"InvalidReceiverAddress\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"router\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"InvalidRouter\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"currentBalance\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"calculatedFees\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"NotEnoughBalance\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [],\\r\\n\\t\\t\\\"name\\\": \\\"NothingToWithdraw\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"SenderNotAllowed\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sourceChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"SourceChainNotAllowed\\\",\\r\\n\\t\\t\\\"type\\\": \\\"error\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"anonymous\\\": false,\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes32\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"messageId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bytes32\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sourceChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"text\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"token\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAmount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"MessageReceived\\\",\\r\\n\\t\\t\\\"type\\\": \\\"event\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"anonymous\\\": false,\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes32\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"messageId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bytes32\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"destinationChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"text\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"token\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAmount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"feeToken\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"fees\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"MessageSent\\\",\\r\\n\\t\\t\\\"type\\\": \\\"event\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"anonymous\\\": false,\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"from\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"to\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"OwnershipTransferRequested\\\",\\r\\n\\t\\t\\\"type\\\": \\\"event\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"anonymous\\\": false,\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"from\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": true,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"to\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"OwnershipTransferred\\\",\\r\\n\\t\\t\\\"type\\\": \\\"event\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"anonymous\\\": false,\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"payId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"PaymentClaimed\\\",\\r\\n\\t\\t\\\"type\\\": \\\"event\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"anonymous\\\": false,\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"payId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"deadline\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"PaymentInitiated\\\",\\r\\n\\t\\t\\\"type\\\": \\\"event\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"anonymous\\\": false,\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"payId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"indexed\\\": false,\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"PaymentReverted\\\",\\r\\n\\t\\t\\\"type\\\": \\\"event\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [],\\r\\n\\t\\t\\\"name\\\": \\\"acceptOwnership\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_destinationChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"allowed\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"allowlistDestinationChain\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"allowed\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"allowlistSender\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_sourceChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"allowed\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"allowlistSourceChain\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"allowlistedDestinationChains\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"allowlistedSenders\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"allowlistedSourceChains\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_paymentId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_destinationChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"deployedReceivingContract\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_receivingAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"calculateOverheadFee\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"overheadFee\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"components\\\": [\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes32\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"messageId\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"bytes32\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"sourceChainSelector\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"bytes\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"data\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"bytes\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"components\\\": [\\r\\n\\t\\t\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"token\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t\\t\\t\\t\\t}\\r\\n\\t\\t\\t\\t\\t\\t],\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"struct Client.EVMTokenAmount[]\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"destTokenAmounts\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"tuple[]\\\"\\r\\n\\t\\t\\t\\t\\t}\\r\\n\\t\\t\\t\\t],\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"struct Client.Any2EVMMessage\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"message\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"tuple\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"ccipReceive\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [],\\r\\n\\t\\t\\\"name\\\": \\\"currPaymentId\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint8\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"c\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint8\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"fromHexChar\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint8\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint8\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"pure\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [],\\r\\n\\t\\t\\\"name\\\": \\\"getLastReceivedMessageDetails\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes32\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"messageId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bytes32\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"text\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAmount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"getReceivedPayments\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"components\\\": [\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"deadline\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"claimed\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"reverted\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"paymentId\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t\\t\\t}\\r\\n\\t\\t\\t\\t],\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"struct ProgrammableTokenTransfers.Payment[]\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"tuple[]\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [],\\r\\n\\t\\t\\\"name\\\": \\\"getRouter\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"getSentPayments\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"components\\\": [\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"deadline\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"claimed\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"reverted\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t\\t\\t},\\r\\n\\t\\t\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"name\\\": \\\"paymentId\\\",\\r\\n\\t\\t\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t\\t\\t}\\r\\n\\t\\t\\t\\t],\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"struct ProgrammableTokenTransfers.Payment[]\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"tuple[]\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"s\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"hexStringToAddress\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bytes\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"pure\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [],\\r\\n\\t\\t\\\"name\\\": \\\"owner\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"payments\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"deadline\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"claimed\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"reverted\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"paymentId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"receivedPayments\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"deadline\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"claimed\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"reverted\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"paymentId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_paymentId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"revertPayment\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_paymentId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_destinationChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"deployedReceivingContract\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_receivingAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"sendMessagePayLINK\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes32\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"messageId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bytes32\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_paymentId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint64\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_destinationChainSelector\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint64\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"deployedReceivingContract\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_receivingAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"sendMessagePayNative\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes32\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"messageId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bytes32\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_amount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_timeAhead\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"sendPayment\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"sentPayments\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"sender\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"receiver\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"tokenAddress\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"amount\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"deadline\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"claimed\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"reverted\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"uint256\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"paymentId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"uint256\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"view\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bytes4\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"interfaceId\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bytes4\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"supportsInterface\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"bool\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"bool\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"pure\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"string\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"s\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"string\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"toAddress\\\",\\r\\n\\t\\t\\\"outputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"pure\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"to\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"transferOwnership\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_beneficiary\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"withdraw\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"inputs\\\": [\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_beneficiary\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t},\\r\\n\\t\\t\\t{\\r\\n\\t\\t\\t\\t\\\"internalType\\\": \\\"address\\\",\\r\\n\\t\\t\\t\\t\\\"name\\\": \\\"_token\\\",\\r\\n\\t\\t\\t\\t\\\"type\\\": \\\"address\\\"\\r\\n\\t\\t\\t}\\r\\n\\t\\t],\\r\\n\\t\\t\\\"name\\\": \\\"withdrawToken\\\",\\r\\n\\t\\t\\\"outputs\\\": [],\\r\\n\\t\\t\\\"stateMutability\\\": \\\"nonpayable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"function\\\"\\r\\n\\t},\\r\\n\\t{\\r\\n\\t\\t\\\"stateMutability\\\": \\\"payable\\\",\\r\\n\\t\\t\\\"type\\\": \\\"receive\\\"\\r\\n\\t}\\r\\n]\""
}