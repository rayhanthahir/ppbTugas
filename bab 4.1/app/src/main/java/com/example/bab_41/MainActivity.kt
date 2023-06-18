package com.example.bab_41

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.image_view)
        imageView.setOnClickListener {
            Toast.makeText(this, "Aye Ayee Capt!", Toast.LENGTH_SHORT).show()
        }
    }
}