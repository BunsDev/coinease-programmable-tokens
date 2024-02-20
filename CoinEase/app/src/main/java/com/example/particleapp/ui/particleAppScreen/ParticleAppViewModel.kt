package com.example.particleapp.ui.particleAppScreen

import androidx.lifecycle.ViewModel
import com.particle.base.ParticleNetwork
import com.particle.base.data.ErrorInfo
import com.particle.base.data.WebOutput
import com.particle.base.data.WebServiceCallback
import com.particle.base.model.LoginType
import com.particle.base.model.ResultCallback
import com.particle.base.model.SupportAuthType
import com.particle.base.model.UserInfo
import com.particle.network.ParticleNetworkAuth.getAddress
import com.particle.network.ParticleNetworkAuth.getUserInfo
import com.particle.network.ParticleNetworkAuth.login
import com.particle.network.ParticleNetworkAuth.logout
import com.particle.network.ParticleNetworkAuth.switchChain
import com.example.particleapp.data.QrCodeData
import network.particle.chains.ChainInfo
import javax.net.ssl.HttpsURLConnection

class ParticleAppViewModel : ViewModel() {
    var paymentSuccess: Boolean = false
    var paymentData = QrCodeData(
        address = "",
        amount = "0",
        chainId = ParticleNetwork.chainId.toString(),
        chainName = ParticleNetwork.chainName
    )
    fun login(onLoginSuccessful : () -> Unit, onLoginFailed : (String) -> Unit) {
        ParticleNetwork.login(
            loginType = LoginType.EMAIL,
            account = "",
            supportAuthTypeValues = SupportAuthType.GOOGLE.value or SupportAuthType.FACEBOOK.value or SupportAuthType.PHONE.value,
            loginCallback = object : WebServiceCallback<UserInfo> {
                override fun success(output: UserInfo) {
                    onLoginSuccessful()
                }

                override fun failure(errMsg: ErrorInfo) {
                    onLoginFailed(errMsg.message)
                }
            }
        )
    }
    fun logout(onLogoutSuccessful : () -> Unit, onLogoutFailed : (String) -> Unit) {
        ParticleNetwork.logout(object : WebServiceCallback<WebOutput> {
            override fun success(output: WebOutput) {
                onLogoutSuccessful()
            }

            override fun failure(errMsg: ErrorInfo) {
                onLogoutFailed(errMsg.message)
            }
        })
    }

    fun switchChain(chainInfo: ChainInfo, onSuccess: () -> Unit, onFailure: () -> Unit) {
        ParticleNetwork.switchChain(
            chainInfo = chainInfo,
            callback = object : ResultCallback {
                override fun success() {
                    onSuccess()
                }

                override fun failure() {
                    onFailure()
                }
            }
        )
    }

    private fun getUserInfo() : UserInfo? = ParticleNetwork.getUserInfo()
    fun avatar() = ParticleNetwork.getUserInfo()?.avatar

    fun userLoginEmail(): String? {
        var email : String? = ""
        if (ParticleNetwork.getUserInfo()?.email != null)
            email = ParticleNetwork.getUserInfo()?.email
        else if (ParticleNetwork.getUserInfo()?.phone != null)
            email = ParticleNetwork.getUserInfo()?.phone
        else if (ParticleNetwork.getUserInfo()?.googleEmail != null)
            email = ParticleNetwork.getUserInfo()?.googleEmail
        else if (ParticleNetwork.getUserInfo()?.facebookEmail != null)
            email = ParticleNetwork.getUserInfo()?.facebookEmail
        return email
    }

    fun address() = ParticleNetwork.getAddress()

    fun particleNetwork() = ParticleNetwork
}