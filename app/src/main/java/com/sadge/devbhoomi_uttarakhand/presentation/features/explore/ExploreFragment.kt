package com.sadge.devbhoomi_uttarakhand.presentation.features.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreBinding

class ExploreFragment : Fragment() {

    private var binding: FragmentExploreBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExploreBinding.inflate(inflater)
        val pagerAdapter = ExplorePagerAdapter(this)
        binding!!.explorePager.adapter = pagerAdapter
        TabLayoutMediator(binding!!.exploreTabLayout,binding!!.explorePager){ tab,position ->
            run {
                when (position) {
                    0 -> tab.text = "Spiritual"
                    1 -> tab.text = "Adventure"
                    2 -> tab.text = "Nature"
                    3 -> tab.text = "Wildlife"
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