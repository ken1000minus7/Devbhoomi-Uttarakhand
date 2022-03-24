package com.sadge.devbhoomi_uttarakhand.data

import com.google.gson.annotations.SerializedName

class Plan (
    @SerializedName("plan")
    val planList:  ArrayList<PlanItem>
)