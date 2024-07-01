package com.test.openai.TestOpenai.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.test.openai.TestOpenai.domain.Message

data class Choice(
    val index: Int,
    val message: Message,
    @JsonProperty("finish_reason") val finishReason: String
)
