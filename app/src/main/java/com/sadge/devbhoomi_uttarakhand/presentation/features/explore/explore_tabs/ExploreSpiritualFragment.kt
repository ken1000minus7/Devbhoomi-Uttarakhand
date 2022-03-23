package com.sadge.devbhoomi_uttarakhand.presentation.features.explore.explore_tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreSpiritualBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentHomeBinding

class ExploreSpiritualFragment : Fragment() {

    private var binding: FragmentExploreSpiritualBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExploreSpiritualBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}