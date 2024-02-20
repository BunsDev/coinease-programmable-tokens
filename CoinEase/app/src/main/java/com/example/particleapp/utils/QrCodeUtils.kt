package com.example.particleapp.utils

import android.graphics.Bitmap
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.toArgb
import com.example.particleapp.data.QrCodeData
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.qrcode.QRCodeWriter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import network.particle.chains.ChainInfo

object QrCodeUtils {
    fun getQrCodeBitmap(content: String): ImageBitmap {
        val size = 512
        val hints = hashMapOf<EncodeHintType, Int>().also { it[EncodeHintType.MARGIN] = 1 } // Make the QR code buffer border narrower
        val bits = QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, size, size, hints)
        return Bitmap.createBitmap(size, size, Bitmap.Config.RGB_565).also {
            for (x in 0 until size) {
                for (y in 0 until size) {
                    it.setPixel(x, y, if (bits[x, y]) Color.Black.toArgb() else Color.White.toArgb())
                }
            }
        }.asImageBitmap()
    }

    fun getReceivingQrCode(address: String, amount: Float = 0f, chainInfo: ChainInfo): ImageBitmap {
        val qrCodeData = QrCodeData(address, amount.toString(), chainInfo.id.toString(), chainInfo.name)
        val content = Json.encodeToString(qrCodeData)
        return getQrCodeBitmap(content)
    }
}