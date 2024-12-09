package com.example.aaaaa

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private val countryList = listOf (
        Country ("South Korea"),
        Country ("Japan"),
        Country ("China"),
        Country ("Singapore"),
        Country ("Thailand"),
        Country ("Indonesia"),
        Country ("Philippines"),
        Country ("Vietnam"),
        Country ("Thailand"),
        Country ("India"),
        Country ("Bangladesh"),
        Country ("Pakistan"),
        Country ("North Korea"),
        Country ("Saudi Arabia"),
        Country ("Iran"),
        Country ("Iraq"),
        Country ("Turkey"),
        Country ("Kazakhstan"),
        Country ("Israel"),
        Country ("Malaysia"),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        recyclerView = findViewById(R.id.recyclerView)

        val adapter = CountryAdapter(countryList)

        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}