package com.gbizotto.suitability.repository

import com.gbizotto.suitability.model.Question

interface ConversationCallback {
    fun onNextQuestion(question: Question)
}