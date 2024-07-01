package com.test.openai.TestOpenai.response

import com.fasterxml.jackson.annotation.JsonProperty

data class OpenAIResponse(
    val id: String,
    @JsonProperty("object") val objectValue: String,
    val created: Long,
    val model: String,
    val choices: List<Choice>,
    val usage: Usage,
    @JsonProperty("system_fingerprint") val systemFingerprint: String
)
