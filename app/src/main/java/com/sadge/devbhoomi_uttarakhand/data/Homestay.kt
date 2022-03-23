package com.sadge.devbhoomi_uttarakhand.data

import com.google.gson.annotations.SerializedName

class Homestay (
    @SerializedName("list")
    val homestayList: MutableList<HomestayItem>
        )