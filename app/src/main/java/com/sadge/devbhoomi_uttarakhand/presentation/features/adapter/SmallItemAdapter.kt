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

class SmallItemAdapter(private val images:List<Pair<String,String>>, private val context: Context):RecyclerView.Adapter<SmallItemAdapter.ViewHolder>() {
    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.smallimageinwa)
        val title: TextView = itemView.findViewById(R.id.small_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_rv_small,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = images[position]
        Glide.with(context).load(image.first).into(holder.image)
        holder.title.text = image.second
    }

    override fun getItemCount(): Int {
        return images.size
    }
}