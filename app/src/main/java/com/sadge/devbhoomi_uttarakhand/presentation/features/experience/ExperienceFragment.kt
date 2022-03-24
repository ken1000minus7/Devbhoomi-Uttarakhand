package com.sadge.devbhoomi_uttarakhand.presentation.features.experience

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.Experience
import com.sadge.devbhoomi_uttarakhand.data.Plan
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExperienceBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.adapter.ExperienceAdapter
import com.sadge.devbhoomi_uttarakhand.presentation.features.adapter.PlanAdapter

class ExperienceFragment : Fragment() {

    private var binding: FragmentExperienceBinding? = null
    private var adapter: ExperienceAdapter? = null

    override fun onStart() {
        super.onStart()
        val jsonString = activity?.resources!!.openRawResource(R.raw.experience_uk).bufferedReader().use { it.readText() }

        val dataList = Gson().fromJson(jsonString, Experience::class.java)
        adapter = ExperienceAdapter(dataList.experience,requireContext())
        binding!!.experienceRv.adapter = adapter
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExperienceBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}