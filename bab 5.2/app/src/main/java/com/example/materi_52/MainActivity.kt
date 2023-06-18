package com.example.materi_52

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var addButton: Button // Tombol "Tambah Kartu"
    private lateinit var cardContainer: LinearLayout // Container untuk kartu-kartu

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi tombol "tambah kartu"
        addButton = findViewById(R.id.addButton)

        // Inisialisasi container kartu
        cardContainer = findViewById(R.id.cardContainer)

        // Tambahkan kartu baru ketika tombol "Tambah Kartu" ditekan
        addButton.setOnClickListener {
            tambahKartu()
        }
    }

    private fun tambahKartu() {
        // Membuat tampilan kartu baru dari file layout card_layout.xml
        val cardView = LayoutInflater.from(this).inflate(R.layout.card_layout, null) as CardView

        // TextView untuk judul kartu
        val titleTextView = cardView.findViewById<TextView>(R.id.titleTextView)

        // TextView untuk deskripsi kartu
        val descriptionTextView = cardView.findViewById<TextView>(R.id.descriptionTextView)

        // Mengatur judul kartu
        titleTextView.text = "Apa itu warna?"

        // Mengatur deskripsi kartu
        descriptionTextView.text = "fenomena visual yang dihasilkan oleh cahaya yang terlihat oleh mata manusia. Warna dapat memberikan pengalaman estetika dan emosi yang kuat. Warna memiliki berbagai macam karakteristik, seperti kecerahan, kejenuhan, dan nada. Ada banyak warna yang dikenali, seperti merah, biru, kuning, hijau, dan banyak lagi. Setiap warna memiliki arti dan simbolisme yang berbeda dalam budaya dan konteks yang berbeda pula. Warna dapat digunakan untuk menghias, mengekspresikan identitas, mempengaruhi suasana hati, dan mempengaruhi persepsi visual."

        // Mengatur warna latar belakang kartu secara acak
        cardView.setCardBackgroundColor(getRandomColor())

        // Menambahkan kartu ke dalam container
        cardContainer.addView(cardView)
    }

    private fun getRandomColor(): Int {
        // Array warna yang tersedia
        val colors = arrayOf(
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.CYAN,
            Color.MAGENTA
        )
        // Memilih indeks warna secara acak
        val randomIndex = (0 until colors.size).random()

        // Mengembalikan warna yang dipilih secara acak
        return colors[randomIndex]
    }
}
