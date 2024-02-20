package com.example.particleapp.ui.particleAppScreen.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.particleapp.ui.particleAppScreen.ParticleAppViewModel
import network.particle.chains.ChainInfo

@Composable
fun SelectDestinationChainScreen(
    navController: NavHostController,
    viewModel: ParticleAppViewModel
) {
    Column(
        modifier = Modifier
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderScreen(onBackPressed = { navController.popBackStack() })
        ChainListWithSearch(
            items = ChainInfo.getAllChains(),
            onClick = { chainInfo ->
                viewModel.paymentData.chainId = chainInfo.id.toString()
                viewModel.paymentData.chainName = chainInfo.name
                navController.popBackStack()
            }
        )
    }
}