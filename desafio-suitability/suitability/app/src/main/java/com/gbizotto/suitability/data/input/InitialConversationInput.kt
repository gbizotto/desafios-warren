package com.gbizotto.suitability.data.input

import com.google.gson.annotations.SerializedName

data class InitialConversationInput(
    @SerializedName("context") val context: String
)