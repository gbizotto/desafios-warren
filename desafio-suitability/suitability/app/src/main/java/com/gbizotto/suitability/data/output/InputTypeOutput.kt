package com.gbizotto.suitability.data.output

import com.google.gson.annotations.SerializedName

data class InputTypeOutput(
    @SerializedName("type") val type: String,
    @SerializedName("mask") val mask: String
)