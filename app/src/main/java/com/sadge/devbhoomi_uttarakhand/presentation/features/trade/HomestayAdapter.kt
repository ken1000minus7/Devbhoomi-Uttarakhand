package com.sadge.devbhoomi_uttarakhand.presentation.features.trade

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sadge.devbhoomi_uttarakhand.R
import org.json.JSONObject

class HomestayAdapter(val context: Context,val dataList : MutableList<JSONObject>) : RecyclerView.Adapter<HomestayAdapter.HomestayViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomestayViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.homestay_list_item,parent,false)
        return HomestayViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomestayViewHolder, position: Int) {
        val dataObject = dataList[position]
        val name = dataObject["Exported data"].toString()
        val address = dataObject["Column2"].toString()
        val email = dataObject["Column3"].toString()
        val phoneString = dataObject["Column4"].toString()
        var phone = ""
        for (i in 0..phoneString.length)
        {
            if(phoneString[i]=='S' || phoneString[i]=='T') phone+="\n"
            phone += phoneString[i]
        }
        holder.name.text = name
        holder.address.text = address
        holder.email.text = email
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