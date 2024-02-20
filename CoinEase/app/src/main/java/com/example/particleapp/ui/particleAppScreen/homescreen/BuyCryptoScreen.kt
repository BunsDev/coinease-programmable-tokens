package com.example.particleapp.ui.particleAppScreen.homescreen

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.example.particleapp.ui.particleAppScreen.ParticleAppViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import coil.compose.AsyncImage
import com.example.particleapp.R
import com.example.particleapp.data.Payment
import com.example.particleapp.utils.Network
import com.particle.base.ParticleNetwork
import com.particle.network.ParticleNetworkAuth.getAddress
import network.particle.chains.ChainInfo

@Composable
fun BuyCryptoScreen(
    navController: NavHostController,
    viewModel: ParticleAppViewModel,
    showToast: (String) -> Unit,
    current: Context
) {
    var isLoading by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderScreen(onBackPressed = { navController.popBackStack() })
        if (isLoading) Spacer(modifier = Modifier.height(30.dp))
        LoadingCircle(isVisible = isLoading)
        LazyColumn {
            items(1) { index ->
                isLoading = false
                OrderItem(
                    orderId = "1",
                    amountAsked = "0.0015",
                    tokensProvided = "15",
                    current
                )
                Spacer(modifier = Modifier.height(10.dp))
                Divider(
                    modifier = Modifier
                        .fillMaxWidth(),
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}

@Composable
fun OrderItem(
    orderId: String,
    amountAsked: String,
    tokensProvided: String,
    current: Context
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Order id: $orderId"
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Tokens Provided: $tokensProvided AVAX",
                )
                Spacer(modifier = Modifier.width(8.dp))
                AsyncImage(model = ChainInfo.Avalanche.icon, contentDescription = null, modifier = Modifier.size(24.dp))
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Amount Asked: $amountAsked USD",
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = {
                    current.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://pages.razorpay.com/pl_NclZ0KW6Fo5pqO/view")))
                },
                modifier = Modifier.align(Alignment.End),
            ) {
                Text("Accept Order")
            }
        }
    }
}