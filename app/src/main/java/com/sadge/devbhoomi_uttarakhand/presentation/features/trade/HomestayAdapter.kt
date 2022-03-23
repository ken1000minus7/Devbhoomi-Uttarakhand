package com.sadge.devbhoomi_uttarakhand.presentation.features.trade

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.HomestayItem
import com.sadge.devbhoomi_uttarakhand.data.TraveltradeItem
import org.json.JSONObject

class HomestayAdapter(val context: Context, val dataList: MutableList<HomestayItem>) : RecyclerView.Adapter<HomestayAdapter.HomestayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomestayViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.homestay_list_item,parent,false)
        return HomestayViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomestayViewHolder, position: Int) {
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
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class HomestayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.homestay_name)
        val address = itemView.findViewById<TextView>(R.id.homestay_address)
        val email = itemView.findViewById<TextView>(R.id.homestay_email)
        val phone = itemView.findViewById<TextView>(R.id.homestay_phone)
    }
}