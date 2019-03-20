package com.gbizotto.suitability.data.mapper.output

import com.gbizotto.suitability.data.output.ConversationOutput
import com.gbizotto.suitability.data.output.InputTypeOutput
import com.gbizotto.suitability.data.output.MessageOutput
import com.gbizotto.suitability.model.Question
import com.gbizotto.suitability.model.InputType
import com.gbizotto.suitability.model.Message

object ConversationOutputMapper {

    fun toConversation(conversationOutput: ConversationOutput): Question {
        return with(conversationOutput) {
            Question(
                id,
                toMessages(messages),
                buttons,
                toInputTypes(inputs),
                responses
            )
        }
    }

    private fun toMessages(messagesOutput: List<MessageOutput>): List<Message> {
        return messagesOutput.map {
            with(it) {
                Message(type, value)
            }
        }
    }

    private fun toInputTypes(inputTypesOutput: List<InputTypeOutput>): List<InputType> {
        return inputTypesOutput.map {
            with(it) {
                InputType(type, mask)
            }
        }
    }
}