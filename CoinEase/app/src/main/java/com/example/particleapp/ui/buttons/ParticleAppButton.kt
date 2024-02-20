package com.example.particleapp.ui.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ParticleAppButton(buttonText: String, onClick : () -> Unit = {}) {
    Button(modifier = Modifier.fillMaxWidth(), onClick = onClick) {
        Text(text = buttonText, fontSize = 15.sp)
    }
}