package com.bara_x.myapplication.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bara_x.myapplication.Plants
import com.bara_x.myapplication.R
import com.bara_x.myapplication.databinding.PlantItemBinding

class PlantAdapter : RecyclerView.Adapter<PlantAdapter.PlantHolder>() {

    class PlantHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = PlantItemBinding.bind(item)

            fun bind(plants: Plants) = with(binding){
                imageView.setImageResource(plants.imageId)
                textView.text = plants.title

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item, parent,false)
        return PlantHolder(view)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}