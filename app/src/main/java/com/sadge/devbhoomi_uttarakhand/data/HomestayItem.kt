package com.sadge.devbhoomi_uttarakhand.data

import com.google.gson.annotations.SerializedName

data class HomestayItem(
    @SerializedName("name")
    val name : String,
    @SerializedName("address")
    val address : String,
    @SerializedName("email")
    val email : String,
    @SerializedName("phone")
    val phone : String
)