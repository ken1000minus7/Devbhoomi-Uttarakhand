package com.sadge.devbhoomi_uttarakhand.presentation.features.explore

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sadge.devbhoomi_uttarakhand.presentation.features.explore.explore_tabs.ExploreAdventureFragment
import com.sadge.devbhoomi_uttarakhand.presentation.features.explore.explore_tabs.ExploreNatureFragment
import com.sadge.devbhoomi_uttarakhand.presentation.features.explore.explore_tabs.ExploreSpiritualFragment
import com.sadge.devbhoomi_uttarakhand.presentation.features.explore.explore_tabs.ExploreWildlifeFragment

class ExplorePagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ExploreSpiritualFragment()
            1 -> ExploreAdventureFragment()
            2 -> ExploreNatureFragment()
            else -> ExploreWildlifeFragment()
        }
    }
}