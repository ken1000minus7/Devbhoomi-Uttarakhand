package com.sadge.devbhoomi_uttarakhand.presentation.features.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aemerse.slider.model.CarouselItem
import com.google.gson.Gson
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.data.HomepageDiscoverUK
import com.sadge.devbhoomi_uttarakhand.data.HomepageDiscoverUKItem
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentHomeBinding
import com.sadge.devbhoomi_uttarakhand.presentation.features.adapter.DiscoverUKHomeAdapter
import com.sadge.devbhoomi_uttarakhand.presentation.features.adapter.Listens
import com.sadge.devbhoomi_uttarakhand.util.Strings.feelTheThrill
import com.sadge.devbhoomi_uttarakhand.util.Strings.flavoursOfTheLand
import com.sadge.devbhoomi_uttarakhand.util.Strings.fromThePast
import com.sadge.devbhoomi_uttarakhand.util.Strings.godsGrace
import com.sadge.devbhoomi_uttarakhand.util.Strings.intoTheWild
import com.sadge.devbhoomi_uttarakhand.util.Strings.naturesBounty
import com.sadge.devbhoomi_uttarakhand.util.Strings.reconnect

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null
    private var adapter: DiscoverUKHomeAdapter? = null

    override fun onStart() {
        super.onStart()
        val jsonString = activity?.resources!!.openRawResource(R.raw.images_homepage_discover_uttarakhand).bufferedReader().use { it.readText() }

        val dataList = Gson().fromJson(jsonString, HomepageDiscoverUK::class.java)
        adapter = DiscoverUKHomeAdapter(dataList,requireContext())
        binding!!.rvHome.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        binding!!.carousel.registerLifecycle(lifecycle)
        val listOfWhyVisitUKItem = mutableListOf<CarouselItem>(CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2021-02/Binsar%20Wildlife%20Sanctuary_1.jpg","Binsar WildLife Sanctuary"),
        CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2021-11/Kedarnath2.jpeg","Kedarnath Dham"),
            CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2021-11/Rishikesh.jpg","Rishikesh, World Capital of Yoga"),
            CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2022-01/Home%20page%20Banner_%20trikansh%20sharma.jpg","Jim Corbett National Park"),
            CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2021-11/Khaliya%20Top%2C%20Munsiyari%20%281%29.jpg","Khaliya Top"),
            CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2021-11/Banner_Stargazing1.jpeg","Under the Stars"),
            CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2020-09/FAQ_Homestay_Banner.jpg","Enjoy our Homestays"),
            CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2021-02/03-March_0.jpg","Banderpunch peak from Dayara Bugyal"),
            CarouselItem("https://uttarakhandtourism.gov.in/sites/default/files/2021-02/Chaliya-Dance_0.jpg","Colours of Culture")
        )
        binding!!.carousel.setData(listOfWhyVisitUKItem)

        return binding!!.root
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }

//    override fun onCardClicked(item: HomepageDiscoverUKItem) {
//        when (item.title) {
//            godsGrace -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToGodsgraceFragment()
//                findNavController().navigate(action)
//            }
//            intoTheWild -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToWildFragment()
//                findNavController().navigate(action)
//            }
//            feelTheThrill -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToFeelTheThrillFragment()
//                findNavController().navigate(action)
//            }
//            naturesBounty -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToNatureBountyFragment()
//                findNavController().navigate(action)
//
//            }
//            reconnect -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToReconnectFragment()
//                findNavController().navigate(action)
//            }
//            fromThePast -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToPastFragment()
//                findNavController().navigate(action)
//            }
//            flavoursOfTheLand -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToFlavoursFragment()
//                findNavController().navigate(action)
//            }
//            else -> {
//                val action = HomeFragmentDirections.actionHomeFragmentToVoiceCultureFragment()
//                findNavController().navigate(action)
//            }
//        }
//
//    }
}