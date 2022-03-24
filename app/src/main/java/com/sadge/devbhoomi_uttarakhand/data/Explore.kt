package com.sadge.devbhoomi_uttarakhand.data

import com.google.gson.annotations.SerializedName

data class Explore(
    @SerializedName("Adventure")
    val Adventure: ArrayList<Adventure>,
    @SerializedName("Nature")
    val Nature: ArrayList<Nature>,
    @SerializedName("Spiritual")
    val Spiritual: ArrayList<Spiritual>,
    @SerializedName("Wildlife")
    val Wildlife: ArrayList<Wildlife>
)