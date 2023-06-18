package com.example.bab_23

import android.content.Intent
import android.net.Uri
import android.view.View
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openYoutube(view: View) {
        val url = "https://www.youtube.com"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    fun dialNumber(view: View) {
        val phoneNumber = "1234567890"
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(intent)
    }

    fun openMap(view: View) {
        val location = "latitude,longitude"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:$location"))
        startActivity(intent)
    }

    fun shareText(view: View) {
        val text = "Hello, ini adalah hasil yang anda telah tekan."
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(intent, "Share via"))
    }
}