package com.sadge.devbhoomi_uttarakhand.presentation.features.trade

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.TraveltradeItem

class TraveltradeAdapter(val context: Context, val dataList : MutableList<TraveltradeItem>) : RecyclerView.Adapter<TraveltradeAdapter.TraveltradeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TraveltradeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.traveltrade_list_item,parent,false)
        return TraveltradeViewHolder(view)
    }

    override fun onBindViewHolder(holder: TraveltradeViewHolder, position: Int) {
        val dataObject = dataList[position]
        val phoneString = dataObject.phone
        var phone = ""
        for (i in phoneString.indices)
        {
            if(phoneString[i]=='S' || phoneString[i]=='T') phone+="\n"
            phone += phoneString[i]
        }
        holder.name.text = dataObject.name.uppercase()
        holder.address.text = dataObject.address
        holder.email.text = dataObject.email
        holder.phone.text = phone
        if(dataObject.website==null || dataObject.website == "")
        {
            holder.website.visibility = View.GONE
            holder.websiteHeader.visibility = View.GONE
        }
        else holder.website.text = dataObject.website
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class TraveltradeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.traveltrade_name)
        val address = itemView.findViewById<TextView>(R.id.traveltrade_address)
        val email = itemView.findViewById<TextView>(R.id.traveltrade_email)
        val phone = itemView.findViewById<TextView>(R.id.traveltrade_phone)
        val website = itemView.findViewById<TextView>(R.id.traveltrade_website)
        val websiteHeader = itemView.findViewById<TextView>(R.id.traveltrade_website_header)
    }
}