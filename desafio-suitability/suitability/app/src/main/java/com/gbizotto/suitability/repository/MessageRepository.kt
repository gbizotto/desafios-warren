package com.gbizotto.suitability.repository

import com.gbizotto.suitability.model.Question
import com.gbizotto.suitability.transferobject.ConversationTO

interface MessageRepository {
    fun postConversation(
        conversationTO: ConversationTO,
        currentQuestion: Question,
        conversationCallback: ConversationCallback
    )

    fun startConversation()
}