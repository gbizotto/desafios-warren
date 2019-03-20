package com.gbizotto.suitability.data.api

import com.gbizotto.suitability.data.input.ConversationInput
import com.gbizotto.suitability.data.input.InitialConversationInput
import com.gbizotto.suitability.data.output.ConversationOutput
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface MessageApi {

    @POST("/conversation/message")
    fun startConversation(@Body initialConversationInput: InitialConversationInput): Call<ConversationOutput>

    @POST("/conversation/message")
    fun submitConversation(@Body conversationInput: ConversationInput): Call<ConversationOutput>
}