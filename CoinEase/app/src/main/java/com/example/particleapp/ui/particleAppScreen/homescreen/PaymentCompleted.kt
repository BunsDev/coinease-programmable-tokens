package com.example.particleapp.ui.particleAppScreen.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.particleapp.ui.particleAppScreen.ParticleAppViewModel
import com.example.particleapp.ui.particleAppScreen.Screen

@Composable
fun PaymentCompleted(
    navController: NavHostController,
    viewModel: ParticleAppViewModel
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (viewModel.paymentSuccess) {
            Icon(
                modifier = Modifier
                    .size(200.dp),
                imageVector = Icons.Default.CheckCircle,
                contentDescription = null,
                tint = Color.Green
            )
            Spacer(modifier = Modifier.height(70.dp))
            Text("Payment Successful")
        }
        else {
            Icon(
                modifier = Modifier
                    .size(200.dp),
                imageVector = Icons.Default.Clear,
                contentDescription = null,
                tint = Color.Red
            )
            Spacer(modifier = Modifier.height(70.dp))
            Text("Payment Failed")
        }
        Spacer(modifier = Modifier.height(140.dp))
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 25.dp),
            onClick = {
                navController.navigate(Screen.HomeScreen)
            }
        ) {
            Text(text = "Return to Home Page")
        }
    }
}