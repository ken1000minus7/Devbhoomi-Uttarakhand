package com.sadge.devbhoomi_uttarakhand.presentation.features.explore.explore_tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreAdventureBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreSpiritualBinding

class ExploreAdventureFragment : Fragment() {

    private var binding: FragmentExploreAdventureBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExploreAdventureBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}