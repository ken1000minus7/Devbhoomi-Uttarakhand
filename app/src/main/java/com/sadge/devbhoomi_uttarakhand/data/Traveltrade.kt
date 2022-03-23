package com.sadge.devbhoomi_uttarakhand.data

import com.google.gson.annotations.SerializedName

class Traveltrade (
    @SerializedName("list")
    val traveltradeList: MutableList<TraveltradeItem>
)