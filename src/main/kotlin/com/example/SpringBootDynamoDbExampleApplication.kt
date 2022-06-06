package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootDynamoDbExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringBootDynamoDbExampleApplication>(*args)
}
