package com.gbizotto.suitability.repository

import com.gbizotto.suitability.data.api.MessageApi
import com.gbizotto.suitability.data.mapper.input.ConversationInputMapper
import com.gbizotto.suitability.model.Question
import com.gbizotto.suitability.transferobject.ConversationTO
import javax.inject.Inject

class MessageRemoteRepository @Inject constructor(private val messageApi: MessageApi) : MessageRepository {
    override fun postConversation(
        conversationTO: ConversationTO,
        currentQuestion: Question,
        conversationCallback: ConversationCallback
    ) {

        if (conversationTO.messages.size == 1) {
            messageApi.startConversation(ConversationInputMapper.toInitialConversationInput())
        } else {
            messageApi.submitConversation(
                ConversationInputMapper.toConversationInput(
                    conversationTO,
                    currentQuestion
                )
            )
        }
    }
}