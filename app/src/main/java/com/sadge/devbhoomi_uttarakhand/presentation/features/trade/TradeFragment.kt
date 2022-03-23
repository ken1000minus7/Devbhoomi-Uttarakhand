package com.sadge.devbhoomi_uttarakhand.presentation.features.trade

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentTradeBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.explore.ExplorePagerAdapter

class TradeFragment : Fragment() {

    private var binding: FragmentTradeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTradeBinding.inflate(inflater)
        val pagerAdapter = TradePagerAdapter(this)
        binding!!.tradePager.adapter = pagerAdapter
        TabLayoutMediator(binding!!.tradeTabLayout,binding!!.tradePager){ tab,position ->
            run {
                when (position) {
                    0 -> tab.text = "Homestay Listing"
                    1 -> tab.text = "Travel Trade Listing"
                }
            }
        }.attach()
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}