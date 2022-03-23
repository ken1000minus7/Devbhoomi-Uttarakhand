package com.sadge.devbhoomi_uttarakhand.presentation.features.plan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentPlanBinding

class PlanFragment : Fragment() {

    private var binding: FragmentPlanBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlanBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}