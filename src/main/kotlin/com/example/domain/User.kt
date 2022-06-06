package com.example.domain

import com.amazonaws.services.dynamodbv2.datamodeling.*
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.util.*

@DynamoDBTable(tableName = "users")
class User(
    @field:DynamoDBHashKey
    @field:DynamoDBAttribute(attributeName = "user_id")
    val id: String = UUID.randomUUID().toString(),

    @field:DynamoDBAttribute(attributeName = "nickname")
    val nickname: String,

    @field:DynamoDBTyped(DynamoDBMapperFieldModel.DynamoDBAttributeType.S)
    @field:DynamoDBAttribute(attributeName = "created_at")
    val createdAt: LocalDateTime = now()
)
