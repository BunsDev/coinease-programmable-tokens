package com.example.particleapp.ui.particleAppScreen.homescreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.particleapp.data.BankDetails
import com.example.particleapp.data.Order
import com.example.particleapp.ui.particleAppScreen.ParticleAppViewModel
import com.example.particleapp.utils.Blockchain
import com.example.particleapp.utils.Network
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.math.pow

@Composable
fun SellCryptoScreen(
    navController: NavHostController,
    viewModel: ParticleAppViewModel,
    showToast: (String) -> Unit
) {
    var tokenProviderEmail by remember { mutableStateOf("") }
    var tokenProviderName by remember { mutableStateOf("") }
    var bankName by remember { mutableStateOf("") }
    var ifsc by remember { mutableStateOf("") }
    var accountNumber by remember { mutableStateOf("") }
    var fiatAmountAsked by remember { mutableStateOf("") }
    var tokenProvided by remember { mutableStateOf("") }

    Surface(color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderScreen(onBackPressed = { navController.popBackStack() })
            OutlinedTextField(
                value = tokenProviderEmail,
                shape = RoundedCornerShape(30.dp),
                onValueChange = { tokenProviderEmail = it },
                label = { Text("Token Provider Email") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = tokenProviderName,
                shape = RoundedCornerShape(30.dp),
                onValueChange = { tokenProviderName = it },
                label = { Text("Token Provider Name") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = bankName,
                shape = RoundedCornerShape(30.dp),
                onValueChange = { bankName = it },
                label = { Text("Bank Name") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = ifsc,
                shape = RoundedCornerShape(30.dp),
                onValueChange = { ifsc = it },
                label = { Text("IFSC") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = accountNumber,
                shape = RoundedCornerShape(30.dp),
                onValueChange = { accountNumber = it },
                label = { Text("Account Number") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = fiatAmountAsked,
                shape = RoundedCornerShape(30.dp),
                onValueChange = { fiatAmountAsked = it },
                label = { Text("Fiat Amount Asked") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = tokenProvided,
                shape = RoundedCornerShape(30.dp),
                onValueChange = { tokenProvided = it },
                label = { Text("Token provided") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            )
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = {
                val bankDetails = BankDetails(name = bankName, ifsc = ifsc, accountNumber = accountNumber)
                val order = Order(tokenProviderEmail = tokenProviderEmail, tokenProviderName = tokenProviderName, tokenProviderBankDetails = bankDetails, fiatAmountAsked = fiatAmountAsked.toDoubleOrNull() ?: 0.0)
                CoroutineScope(Dispatchers.IO).launch {
                    Blockchain.addOrder(
                        (tokenProvided.toDouble() * 10.0.pow(18)).toLong(),
                        onSuccess = {
                             showToast("Order successfully created")
                        },
                        onFailed = {

                        },
                        showToast = {

                        }
                    )
                }
            }) {
                Text("Create Order")
            }
        }
    }
}