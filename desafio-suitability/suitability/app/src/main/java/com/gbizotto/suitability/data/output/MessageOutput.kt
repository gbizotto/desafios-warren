package com.gbizotto.suitability.data.output

import com.google.gson.annotations.SerializedName

data class MessageOutput(
    @SerializedName("type") val type: String,
    @SerializedName("value") val value: String
)