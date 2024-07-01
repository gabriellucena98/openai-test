package com.test.openai.TestOpenai

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class TestOpenaiApplication

fun main(args: Array<String>) {
	runApplication<TestOpenaiApplication>(*args)
}
