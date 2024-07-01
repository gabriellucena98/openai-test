package com.test.openai.TestOpenai.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class OpenAIRequest(
    val model: String? = "gpt-3.5-turbo-1106",
    val messages: List<Message>,
    @JsonProperty("max_tokens")
    val maxTokens: Int? = 100
)
