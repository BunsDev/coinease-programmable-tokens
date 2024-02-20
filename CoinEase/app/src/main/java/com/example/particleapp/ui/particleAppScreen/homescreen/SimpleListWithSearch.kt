package com.example.particleapp.ui.particleAppScreen.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.particleapp.ui.particleAppScreen.ParticleAppViewModel
import com.example.particleapp.ui.particleAppScreen.Screen
import network.particle.chains.ChainInfo

@Composable
fun ChainListWithSearch(
    items: List<ChainInfo>,
    onClick: (ChainInfo) -> Unit
) {
    var searchText by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = { Text("Search") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        LazyColumn {
            val filteredItems = items.filter { it.name.contains(searchText, ignoreCase = true) }
            items(filteredItems.size) { index ->
                ListItem(filteredItems[index], onClick = onClick)
            }
        }
    }
}

@Composable
fun ListItem(
    chainInfo: ChainInfo,
    onClick: (ChainInfo) -> Unit
) {
    Button(
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background),
        onClick = {
            onClick(chainInfo)
        }) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            AsyncImage(model = chainInfo.icon, contentDescription = null)
            Spacer(modifier = Modifier.width(16.dp))
            Text(chainInfo.fullname, color = MaterialTheme.colorScheme.onSurface)
        }
    }
}