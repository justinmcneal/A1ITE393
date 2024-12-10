package com.example.aaaaa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

class CountryAdapter(private val countryList: List<String>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    // Create view holder
    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val countryTextView: TextView = itemView.findViewById(R.id.countryName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val countryName = countryList[position]
        holder.countryTextView.text = countryName
    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}
