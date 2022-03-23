package com.sadge.devbhoomi_uttarakhand.presentation.features.trade

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sadge.devbhoomi_uttarakhand.presentation.features.trade.trade_tabs.HomestayListingFragment
import com.sadge.devbhoomi_uttarakhand.presentation.features.trade.trade_tabs.TraveltradeListingFragment


class TradePagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> HomestayListingFragment()
            else -> TraveltradeListingFragment()
        }
    }
}