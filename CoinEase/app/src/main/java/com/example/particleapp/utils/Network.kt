package com.example.particleapp.utils

import com.example.particleapp.data.BankDetails
import com.example.particleapp.data.Order
import com.example.particleapp.data.Payment
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.util.InternalAPI
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

object Network {

    val backendUrl = "http://localhost:3000"
    suspend fun fetchReceivedPayments(receiverAddress: String): List<Payment> {
        val client = HttpClient()

        return try {
            val url = "https://http-nodejs-vkx8.vercel.app/receivedPayments/$receiverAddress"
            val _response = client.get(url)
            val wrappedStringJson = """
                {
                  "payments": ${_response.bodyAsText()}
                }
            """.trimIndent()
            val response = Json.decodeFromString<List<List<String>>>(_response.bodyAsText())

            response
                .filterNot { it[0] == "0x0000000000000000000000000000000000000000" }
                .map {
                    Payment(
                        sender = it[0],
                        receiver = it[1],
                        tokenAddress = it[2],
                        amount = it[3],
                        deadline = it[4],
                        claimed = it[5] != "0",
                        reverted = it[6] != "0",
                        paymentId = it[7]
                    )
                }
        } finally {
            client.close()
        }
    }

    suspend fun fetchSentPayments(senderAddress: String): List<Payment> {
        val client = HttpClient()

        return try {
            val url = "https://http-nodejs-vkx8.vercel.app/sentPayments/$senderAddress"
            val _response = client.get(url)
            val wrappedStringJson = """
                {
                  "payments": ${_response.bodyAsText()}
                }
            """.trimIndent()
            val response = Json.decodeFromString<List<List<String>>>(_response.bodyAsText())

            response
                .filterNot { it[0] == "0x0000000000000000000000000000000000000000" }
                .map {
                    Payment(
                        sender = it[0],
                        receiver = it[1],
                        tokenAddress = it[2],
                        amount = it[3],
                        deadline = it[4],
                        claimed = it[5].toBoolean(),
                        reverted = it[6].toBoolean(),
                        paymentId = it[7]
                    )
                }
        } finally {
            client.close()
        }
    }

    @OptIn(ExperimentalEncodingApi::class, InternalAPI::class)
    suspend fun createOrder(
        email: String,
        name: String,
        bankDetails: BankDetails,
        amountAsked: Double
    ) : HttpResponse? {
        try {
            val response = HttpClient().post("$backendUrl/createOrder") {
                body = Json.encodeToString(
                    Order(
                        email,
                        name,
                        bankDetails,
                        amountAsked
                    )
                )
                contentType(ContentType.Application.Json)
            }
            return response

        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}