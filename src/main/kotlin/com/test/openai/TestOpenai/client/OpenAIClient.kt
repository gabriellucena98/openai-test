package com.test.openai.TestOpenai.client

import com.test.openai.TestOpenai.domain.OpenAIRequest
import com.test.openai.TestOpenai.response.OpenAIResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader

@FeignClient(name = "generativeAI", url = "https://api.openai.com/v1/chat/completions")
interface OpenAIClient {

    @PostMapping(consumes = ["application/json"], produces = ["application/json"])
    fun chatCompletion(
        @RequestHeader("Authorization") authorization: String,
        @RequestBody openAIRequest: OpenAIRequest
    ): OpenAIResponse
}