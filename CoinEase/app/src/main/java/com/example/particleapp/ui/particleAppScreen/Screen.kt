package com.example.particleapp.ui.particleAppScreen

import com.example.particleapp.ui.particleAppScreen.homescreen.SelectDestinationChainScreen

class Screen(screenName: String) {
    companion object {
        const val SplashScreen = "splash_screen"
        const val LoginScreen = "login_screen"
        const val HomeScreen = "home_screen"
        const val MyAccountScreen = "my_account_screen"
        const val SwitchChainScreen = "switch_chain_screen"
        const val PayByAddressScreen = "pay_by_address"
        const val SelectDestinationChainScreen = "select_destination_chain"
        const val QrScanner = "qr_scanner"
        const val PaymentCompletedScreen = "payment_completed"
        const val ViewSentTxScreen = "view_sent_tx_screen"
        const val ViewUnclaimedTxScreen = "view_unclaimed_tx_screen"
        const val SellCryptoScreen = "sell_crypto_screen"
        const val BuyCryptoScreen = "buy_crypto_screen"
    }
}