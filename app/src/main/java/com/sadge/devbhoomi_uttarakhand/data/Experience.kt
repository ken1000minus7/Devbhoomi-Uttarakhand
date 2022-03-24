package com.sadge.devbhoomi_uttarakhand.data

import com.google.gson.annotations.SerializedName

data class Experience(
    @SerializedName("experience")
    val experience: ArrayList<ExperienceItem>
)