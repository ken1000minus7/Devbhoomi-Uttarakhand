package com.sadge.devbhoomi_uttarakhand.presentation.features.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.HomepageDiscoverUKItem

class DiscoverUKHomeAdapter(private val items:ArrayList<HomepageDiscoverUKItem>, private val context: Context):RecyclerView.Adapter<DiscoverUKHomeAdapter.ViewHolder>() {
   inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.discoverImageUKHome)
        val title: TextView = itemView.findViewById(R.id.discoverTitle)
       val disc: TextView = itemView.findViewById(R.id.discoverContent)
        val card: CardView = itemView.findViewById(R.id.cardUK)
//        init {
//            card.setOnClickListener{
//                listens.onCardClicked(items[adapterPosition])
//            }
//        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_home_discover_uk,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = items[position]
        Glide.with(context).load(image.pics).into(holder.image)
        holder.title.text = image.title
        holder.disc.text = image.pics_desc_1
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

interface Listens{
    fun onCardClicked(item:HomepageDiscoverUKItem)
}