package com.gbizotto.suitability.repository

import com.gbizotto.suitability.data.output.ConversationOutput
import com.gbizotto.suitability.model.Question
import com.gbizotto.suitability.transferobject.ConversationTO
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class MessageRepositoryTest {

    val callback = mockk<ConversationCallback>(relaxed = true)

    private val conversationTO = ConversationTO(mockMessages())

    private val currentQuestion = Question("", emptyList(), "", emptyList(), emptyList())

    //TODO mock da api

    @Test
    fun whenPostIsSuccessfull_mustReturnNextQuestion() {
        val repository = MessageRemoteRepository()
        repository.postConversation(conversationTO, currentQuestion, callback)

        verify { callback.onNextQuestion(any()) }
    }

    @Test
    fun whenPostIsNotSuccessfull_mustReturnError() {

    }

    private fun mockMessages(): MutableList<Map<String, String>> {
        return mutableListOf(
            mapOf(
                Pair("a", "b"),
                Pair("c", "d")
            )
        )
    }

    private fun mockSuccessfullPost(): ConversationOutput {
        //TODO colocar os valores corretos
        return ConversationOutput(
            "1",
            emptyList(),
            "",
            emptyList(),
            emptyList()
        )
    }
}