package com.example.particleapp.data

import kotlinx.serialization.Serializable

@Serializable
data class Payment(
    val sender: String,
    val receiver: String,
    val tokenAddress: String,
    val amount: String,
    val deadline: String,
    val claimed: Boolean,
    val reverted: Boolean,
    val paymentId: String
)

@Serializable
data class Payments(
    val payments: List<Payment>
)
