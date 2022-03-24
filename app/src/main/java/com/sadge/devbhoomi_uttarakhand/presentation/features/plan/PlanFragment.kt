package com.sadge.devbhoomi_uttarakhand.presentation.features.plan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.Plan
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentPlanBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.adapter.PlanAdapter

class PlanFragment : Fragment() {

    private var binding: FragmentPlanBinding? = null
    private var adapter: PlanAdapter? = null

    override fun onStart() {
        super.onStart()
        val jsonString = activity?.resources!!.openRawResource(R.raw.plan_uk).bufferedReader().use { it.readText() }

        val dataList = Gson().fromJson(jsonString, Plan::class.java)
        adapter = PlanAdapter(dataList.planList,requireContext())
        binding!!.planRv.adapter = adapter
    }

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