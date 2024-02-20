package com.example.particleapp.ui.particleAppScreen.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.example.particleapp.R
import com.example.particleapp.ui.buttons.ParticleAppButton
import com.example.particleapp.ui.particleAppScreen.ParticleAppViewModel
import com.example.particleapp.ui.particleAppScreen.Screen

@Composable
fun LoginScreen(
    navController: NavHostController,
    viewModel: ParticleAppViewModel,
    showToast: (String) -> Unit
) {
    Image(painter = painterResource(id = R.drawable.splash_screen_logo), contentDescription = null)
    Text(
        text = "To get started, please click on login. You will be redirected to the login page.",
        textAlign = TextAlign.Center
    )
    ParticleAppButton(buttonText = "Login", onClick = { viewModel.login(
        onLoginSuccessful = { navController.navigate(Screen.HomeScreen) },
        onLoginFailed = { showToast("Login Failed: $it") }
    ) })
}