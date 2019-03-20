package com.gbizotto.suitability.repository

import com.gbizotto.suitability.data.api.MessageApi
import com.gbizotto.suitability.data.mapper.input.ConversationInputMapper
import com.gbizotto.suitability.model.Question
import com.gbizotto.suitability.transferobject.ConversationTO
import javax.inject.Inject

class MessageRemoteRepository @Inject constructor(private val messageApi: MessageApi) : MessageRepository {
    override fun startConversation() {
        messageApi.startConversation(ConversationInputMapper.toInitialConversationInput())
    }

    override fun postConversation(
        conversationTO: ConversationTO,
        currentQuestion: Question,
        conversationCallback: ConversationCallback
    ) {
        messageApi.submitConversation(
            ConversationInputMapper.toConversationInput(
                conversationTO,
                currentQuestion
            )
        )
    }
}