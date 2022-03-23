package com.sadge.devbhoomi_uttarakhand.presentation.features.trade.trade_tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.Homestay
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentHomestayListingBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.trade.HomestayAdapter

class HomestayListingFragment : Fragment() {

    private var binding: FragmentHomestayListingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomestayListingBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val jsonString = activity?.resources!!.openRawResource(R.raw.homestay).bufferedReader().use { it.readText() }

        val dataList = Gson().fromJson(jsonString, Homestay::class.java)

        val adapter = HomestayAdapter(requireContext(),dataList.homestayList)
        binding!!.homestayList.adapter = adapter
    }
    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}