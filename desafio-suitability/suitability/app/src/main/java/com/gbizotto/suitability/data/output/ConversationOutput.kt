package com.gbizotto.suitability.data.output

import com.google.gson.annotations.SerializedName

/*
{
    "id": "question_name",
    "messages": [
        {
            "type": "string",
            "value": "Oi, eu sou o Warren. ^1000 Se você quer começar a investir bem e de maneira fácil, ^500 veio ao lugar certo. ^1000 Eu vou te ajudar."
        },
        {
            "type": "string",
            "value": "Antes de começarmos, ^500 como posso te chamar?"
        }
    ],
    "buttons": [],
    "inputs": [
        {
            "type": "string",
            "mask": "name"
        }
    ],
    "responses": [
        "Meu nome é {{answers.question_name}}"
    ]
}
 */
data class ConversationOutput(
    @SerializedName("id") val id: String,
    @SerializedName("messages") val messages: List<MessageOutput>,
    @SerializedName("buttons") val buttons: String, //TODO verificat tipos
    @SerializedName("inputs") val inputs: List<InputTypeOutput>,
    @SerializedName("responses") val responses: List<String>
)