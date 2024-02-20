package com.example.particleapp

import android.app.Application
import com.particle.base.Env
import com.particle.base.ParticleNetwork
import network.particle.chains.ChainInfo
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.HttpsURLConnection

class ParticleApp : Application() {
    override fun onCreate() {
        super.onCreate()
        ParticleNetwork.init(this, Env.DEV, ChainInfo.EthereumSepolia)
    }
}