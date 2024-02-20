package com.example.particleapp.ui.particleAppScreen.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavHostController
import com.example.particleapp.R
import com.example.particleapp.ui.particleAppScreen.ParticleAppViewModel
import com.example.particleapp.ui.particleAppScreen.Screen
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: ParticleAppViewModel
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val navigateToMyAccountScreen = { navController.navigate(Screen.MyAccountScreen) }
        val navigateToPayByAddressScreen = { navController.navigate(Screen.PayByAddressScreen) }
        HeaderHomeScreen(navigateToMyAccountScreen, viewModel::avatar)
        ImageHomeScreen()
        OptionsHomeScreen(navigateToMyAccountScreen, navigateToPayByAddressScreen, navController)
    }
}

@Composable
fun OptionsHomeScreen(
    navigateToMyAccountScreen: () -> Unit,
    navigateToPayByAddressScreen: () -> Unit,
    navController: NavHostController
) {
    Row(
        modifier = Modifier
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        CardButton { PayByQrCodeButton(navController) }
        CardButton { PayByAddressButton(navigateToPayByAddressScreen) }
        CardButton { BuyCryptoButton(navController) }
        CardButton { SellCryptoButton(navController) }
    }

    Column {
        ViewSentTransactions(navController)
        ViewUnclaimedTransactions(navController)
        MyAccount(navigateToMyAccountScreen)
    }
}

@Composable
fun HomeScreenRowButton(
    icon: ImageVector,
    buttonText: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.background)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Button Icon",
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier = Modifier.width(30.dp))
            Text(text = buttonText, color = MaterialTheme.colorScheme.onSurface)
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Arrow Icon",
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
fun MyAccount(navigateToMyAccountScreen: () -> Unit) {
    HomeScreenRowButton(icon = Icons.Default.Person, buttonText = "My Account", onClick = { navigateToMyAccountScreen() })
}

@Composable
fun ViewUnclaimedTransactions(navController: NavHostController) {
    HomeScreenRowButton(icon = Icons.Default.List, buttonText = "View Unclaimed Transactions", onClick = {
        navController.navigate(Screen.ViewUnclaimedTxScreen)
    })
}

@Composable
fun ViewSentTransactions(navController: NavHostController) {
    HomeScreenRowButton(icon = Icons.Default.Send, buttonText = "View Sent Transactions", onClick = {
        navController.navigate(Screen.ViewSentTxScreen)
    })
}

@Composable
fun SellCryptoButton(navController: NavHostController) {
    Button(
        onClick = {
             navController.navigate(Screen.SellCryptoScreen)
        },
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = Modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.transfer_logo),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface
            )
            Text(modifier = Modifier.padding(top = 10.dp),
                text = "Sell\ncrypto",
                fontSize = 10.sp,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun BuyCryptoButton(navController: NavHostController) {
    Button(
        onClick = {
             navController.navigate(Screen.BuyCryptoScreen)
        },
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = Modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.transfer_logo),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface
            )
            Text(modifier = Modifier.padding(top = 10.dp),
                text = "Buy\ncrypto",
                fontSize = 10.sp,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun PayByAddressButton(navigateToPayByAddressScreen: () -> Unit) {
    Button(
        onClick = { navigateToPayByAddressScreen() },
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = Modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.bank_logo),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface
            )
            Text(modifier = Modifier.padding(top = 10.dp),
                text = "Pay by\naddress",
                fontSize = 10.sp,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun PayByQrCodeButton(navController: NavHostController) {
    Button(
        onClick = { navController.navigate(Screen.QrScanner) },
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = Modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.qr_code),
                contentDescription = null,
                modifier = Modifier.size(30.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
            Text(modifier = Modifier.padding(top = 10.dp),
                text = "Pay by\nQR code",
                fontSize = 10.sp,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun CardButton(content: @Composable () -> Unit) {
    Card(
        modifier = Modifier
            .padding(horizontal = 5.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            content()
        }
    }
}

@Composable
fun HeaderHomeScreen(navigateToMyAccountScreen: () -> Unit, getAvatar: () -> String?) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(top = 40.dp, start = 20.dp, bottom = 20.dp)
    ) {
        AddressEditText()
        MyAccountButton(navigateToMyAccountScreen, getAvatar)
    }
}

@Composable
fun MyAccountButton(navigateToMyAccountScreen: () -> Unit, getAvatar: () -> String?) {
    Button(
        onClick = { navigateToMyAccountScreen() },
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = Modifier
    ) {
        if (getAvatar() != null) {
            Image(
                painter = rememberAsyncImagePainter(getAvatar()),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        } else {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Account Icon",
                modifier = Modifier.size(48.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
fun AddressEditText() {
    var text by remember { mutableStateOf(TextFieldValue()) }
    OutlinedTextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        placeholder = { Text(text = "Pay by address", fontSize = 14.sp) },
        modifier = Modifier
            .height(50.dp),
        shape = RoundedCornerShape(30.dp)
    )
}

@Composable
private fun LogoutButton(
    viewModel: ParticleAppViewModel,
    navController: NavHostController,
    showToast: (String) -> Unit
) {
    Button(onClick = {
        viewModel.logout(
            onLogoutSuccessful = { navController.navigate(Screen.LoginScreen) },
            onLogoutFailed = { showToast("Logout Failed $it") }
        )
    }) {
        Text(text = "Log Out")
    }
}

@Composable
private fun ImageHomeScreen() {
    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painterResource(id = R.drawable.home_screen_logo),
        contentDescription = null
    )
}