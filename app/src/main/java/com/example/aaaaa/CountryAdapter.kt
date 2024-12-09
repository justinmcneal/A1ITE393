package com.example.aaaaa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter (val countryList: List <Country>) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

        val countryName = itemView.findViewById<TextView>(R.id.txtCountryName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent,false))
    }

    override fun onBindViewHolder(holder: CountryAdapter.ViewHolder, position: Int) {
        val country = countryList [position]

        holder.countryName.text = country.countryName
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

}