package com.gbizotto.suitability.model

data class Question(
    val id: String,
    val messages: List<Message>,
    val buttons: String, //TODO verificar tipos
    val inputs: List<InputType>,
    val responses: List<String>
)