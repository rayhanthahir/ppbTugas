package com.example.bab_45

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = generateDummyItems() // Fungsi untuk menghasilkan item dummy
        adapter = ItemAdapter(items)
        recyclerView.adapter = adapter
    }

    private fun generateDummyItems(): List<Item> {
        val items = ArrayList<Item>()
        items.add(Item("Mangga", "buah dengan kulit yang halus dan daging yang lembut serta berair. Mangga memiliki rasa manis yang khas dan seringkali memberikan sensasi segar saat dikonsumsi. Buah ini dapat memiliki berbagai warna kulit, seperti kuning, oranye, atau hijau."))
        items.add(Item("Apel", "buah dengan kulit yang mengkilap dan daging yang renyah. Apel biasanya memiliki bentuk bulat atau sedikit lonjong. Terdapat berbagai varietas apel dengan beragam warna kulit, seperti merah, kuning, atau hijau. Rasa apel dapat bervariasi dari manis hingga sedikit masam."))
        items.add(Item("Pisang", "buah berbentuk lonjong dengan kulit yang tebal dan warna kuning saat matang. Pisang memiliki daging yang lembut dan manis. Buah ini sering dikonsumsi dalam keadaan matang atau diolah menjadi berbagai makanan, seperti pisang goreng atau pisang bakar."))

        return items
    }
}