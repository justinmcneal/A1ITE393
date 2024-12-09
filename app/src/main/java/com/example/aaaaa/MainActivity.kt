package com.example.aaaaa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)


        recyclerView.layoutManager = LinearLayoutManager(this)


        val dataList = arrayListOf(
            recyclerData("South Korea"),
            recyclerData("China"),
            recyclerData("Philippines"),
            recyclerData("Japan"),
            recyclerData("Vietnam"),
            recyclerData("Thailand"),
            recyclerData("Singapore"),
            recyclerData("Indonesia"),
            recyclerData("Malaysia"),
            recyclerData("India"),
            recyclerData("Bangladesh"),
            recyclerData("North Korea"),
            recyclerData("Pakistan"),
            recyclerData("Saudi Arabia"),
            recyclerData("United Arab Emirates"),
            recyclerData("Iran"),
            recyclerData("Iraq"),
            recyclerData("Turkey"),
            recyclerData("Israel"),
            recyclerData("Kazakhstan")
        )


        val adapter = Adapter(dataList)
        recyclerView.adapter = adapter
    }
}
