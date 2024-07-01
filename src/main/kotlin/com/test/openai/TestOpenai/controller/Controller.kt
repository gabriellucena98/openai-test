package com.test.openai.TestOpenai.controller

import com.test.openai.TestOpenai.client.OpenAIClient
import com.test.openai.TestOpenai.converter.OpenAIConverter
import com.test.openai.TestOpenai.domain.ImproveTextRequest
import com.test.openai.TestOpenai.response.OpenAIResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/openai/v1")
class Controller(
    private val openAIClient: OpenAIClient,
    @Value("\${openai.key}") private val apiKey: String
) {

    private val authorization = "Bearer $apiKey"

    @PostMapping( "/test", consumes = ["application/json"], produces = ["application/json"])
    fun chatCompletion(
        @RequestBody textRequest: ImproveTextRequest
    ): OpenAIResponse {
        val openAiRequest = OpenAIConverter.toDomain(textRequest)

        return openAIClient.chatCompletion(authorization, openAiRequest)
    }
}