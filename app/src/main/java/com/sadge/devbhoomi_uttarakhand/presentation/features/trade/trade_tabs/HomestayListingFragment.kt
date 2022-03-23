package com.sadge.devbhoomi_uttarakhand.presentation.features.trade.trade_tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreNatureBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentHomestayListingBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.trade.HomestayAdapter
import org.json.JSONArray
import org.json.JSONObject

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
        val text = activity?.resources?.openRawResource(R.raw.homestay)?.bufferedReader().use {
            it?.readText()
        }
        val dataList = mutableListOf(JSONObject(text))
        val adapter = HomestayAdapter(requireContext(),dataList)
        binding!!.homestayList.adapter = adapter
    }
    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}