package com.gbizotto.suitability.data.mapper.input

import com.gbizotto.suitability.data.input.ConversationInput
import com.gbizotto.suitability.data.input.InitialConversationInput
import com.gbizotto.suitability.model.Question
import com.gbizotto.suitability.transferobject.ConversationTO

object ConversationInputMapper {

    private const val context = "suitability"

    fun toInitialConversationInput(): InitialConversationInput {
        return InitialConversationInput(context)
    }

    fun toConversationInput(conversationTO: ConversationTO, currentQuestion: Question): ConversationInput {
        return ConversationInput(context, currentQuestion.id, conversationTO.messages)
    }
}