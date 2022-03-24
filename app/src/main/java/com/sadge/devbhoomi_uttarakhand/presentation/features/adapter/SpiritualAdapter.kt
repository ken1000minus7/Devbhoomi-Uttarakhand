package com.sadge.devbhoomi_uttarakhand.presentation.features.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.Spiritual

class SpiritualAdapter(private val images: ArrayList<Spiritual>, private val context: Context):
    RecyclerView.Adapter<SpiritualAdapter.ViewHolder>() {
    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.spiritualImage)
        val title: TextView = itemView.findViewById(R.id.spiritualTitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_spiritual,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = images[position]
        Glide.with(context).load(image.image).into(holder.image)
        holder.title.text = image.name
    }

    override fun getItemCount(): Int {
        return images.size
    }
}