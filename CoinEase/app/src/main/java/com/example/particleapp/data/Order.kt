package com.example.particleapp.data

import kotlinx.serialization.Serializable

@Serializable
data class BankDetails(
    val name: String,
    val ifsc: String,
    val accountNumber: String
)

@Serializable
data class Order(
    val tokenProviderEmail: String,
    val tokenProviderName: String,
    val tokenProviderBankDetails: BankDetails,
    val fiatAmountAsked: Double
)
