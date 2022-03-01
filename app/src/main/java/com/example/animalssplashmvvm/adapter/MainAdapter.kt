package com.example.animalssplashmvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.animalssplashmvvm.databinding.RecyclerviewItemBinding
import com.example.animalssplashmvvm.model.Animal

class MainAdapter(val animalList: List<Animal>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
  inner class MainViewHolder(
      val itemBinding: RecyclerviewItemBinding):
      RecyclerView.ViewHolder(itemBinding.root) {
          fun bindItem(animal: Animal){
              itemBinding.AnimalNameTextView.text = animal.name
              itemBinding.AnimalDescriptionTextView.text = animal.description
              itemBinding.AnimalImageView.setImageResource(animal.image)
          }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
       return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val animal = animalList[position]
        holder.bindItem(animal)
    }

    override fun getItemCount(): Int {
       return animalList.size
    }


}