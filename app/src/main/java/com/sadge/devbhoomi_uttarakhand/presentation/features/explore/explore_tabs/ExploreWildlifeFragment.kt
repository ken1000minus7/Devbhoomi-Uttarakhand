package com.sadge.devbhoomi_uttarakhand.presentation.features.explore.explore_tabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.Explore
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreSpiritualBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreWildlifeBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.adapter.AdventureAdapter
import com.sadge.devbhoomi_uttarakhand.presentation.features.adapter.WildlifeAdapter

class ExploreWildlifeFragment : Fragment() {

    private var binding: FragmentExploreWildlifeBinding? = null
    private var adapter: WildlifeAdapter? = null

    override fun onStart() {
        super.onStart()
        val jsonString = activity?.resources!!.openRawResource(R.raw.explore_uk).bufferedReader().use { it.readText() }

        val dataList = Gson().fromJson(jsonString, Explore::class.java)
        adapter = WildlifeAdapter(dataList.Wildlife,requireContext())
        binding!!.rvWildlife.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExploreWildlifeBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

}