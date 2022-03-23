package com.sadge.devbhoomi_uttarakhand.presentation.features.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aemerse.slider.model.CarouselItem
import com.sadge.devbhoomi_uttarakhand.R
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentExploreBinding
import com.sadge.devbhoomi_uttarakhand.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

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

}