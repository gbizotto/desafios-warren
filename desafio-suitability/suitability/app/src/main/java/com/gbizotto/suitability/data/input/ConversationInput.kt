package com.gbizotto.suitability.data.input

import com.google.gson.annotations.SerializedName

data class ConversationInput(
    @SerializedName("context") val context: String,
    @SerializedName("id") val id: String,
    @SerializedName("messages") val messages: List<Map<String, String>>
)