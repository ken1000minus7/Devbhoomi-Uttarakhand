package com.sadge.devbhoomi_uttarakhand.presentation.features.trade.trade_tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.Traveltrade
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentTraveltradeListingBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.trade.HomestayAdapter
import com.sadge.devbhoomi_uttarakhand.presentation.features.trade.TraveltradeAdapter

class TraveltradeListingFragment : Fragment() {

    private var binding: FragmentTraveltradeListingBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTraveltradeListingBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val jsonString = activity?.resources!!.openRawResource(R.raw.traveltrade).bufferedReader().use { it.readText() }

        val dataList = Gson().fromJson(jsonString, Traveltrade::class.java)

        val adapter = TraveltradeAdapter(requireContext(),dataList.traveltradeList)
        binding!!.traveltradeList.adapter = adapter
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}