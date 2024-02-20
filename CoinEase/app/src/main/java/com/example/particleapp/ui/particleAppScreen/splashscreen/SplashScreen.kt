package com.example.particleapp.ui.particleAppScreen.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.particleapp.R
import com.example.particleapp.ui.particleAppScreen.Screen
import com.particle.base.ParticleNetwork
import com.particle.network.ParticleNetworkAuth.isLogin
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreen(navController: NavHostController) {
    Image(
        modifier = Modifier
            .padding(start = 100.dp, end = 100.dp),
        painter = painterResource(id = R.drawable.app_logo),
        contentDescription = null
    )
    Text(
        text = "Particle App",
        fontSize = 26.sp,
        fontWeight = FontWeight.Bold
    )
    LaunchedEffect(Unit) {
        CoroutineScope(Dispatchers.Main).launch {
            delay(0)
            navController.popBackStack()
            if (!ParticleNetwork.isLogin()) {
                navController.navigate(Screen.LoginScreen)
            } else {
                navController.navigate(Screen.HomeScreen)
            }
        }
    }
}