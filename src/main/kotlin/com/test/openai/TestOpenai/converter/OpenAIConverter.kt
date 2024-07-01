package com.test.openai.TestOpenai.converter

import com.test.openai.TestOpenai.domain.ImproveTextRequest
import com.test.openai.TestOpenai.domain.Message
import com.test.openai.TestOpenai.domain.OpenAIRequest

object OpenAIConverter {
    fun toDomain(textRequest: ImproveTextRequest): OpenAIRequest {
        return OpenAIRequest(
            messages = listOf(
                Message(
                    role = "system",
                    content = "Você é um coach profissional de league of legends"
                ),
                Message(
                    role = "user",
                    content = textRequest.text
                )
            )
        )
    }
}