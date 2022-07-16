package com.example.post.domain

import com.amazonaws.services.dynamodbv2.datamodeling.*
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import java.util.*

@DynamoDBTable(tableName = "posts")
class Post(
    @field:DynamoDBHashKey
    @field:DynamoDBAttribute(attributeName = "post_id")
    val id: String = UUID.randomUUID().toString(),

    @field:DynamoDBAttribute(attributeName = "user_id")
    @field:DynamoDBIndexRangeKey(globalSecondaryIndexName = "post_user_id_created_at_idx")
    val userId: String,

    @field:DynamoDBAttribute(attributeName = "title")
    @field:DynamoDBIndexHashKey(globalSecondaryIndexName = "post_title_created_at_idx")
    val title: String,

    @field:DynamoDBAttribute(attributeName = "content")
    val content: String,

    @field:DynamoDBAttribute(attributeName = "created_at")
    @field:DynamoDBIndexRangeKey(globalSecondaryIndexNames = ["post_user_id_created_at_idx", "post_title_created_at_idx"])
    val createdAt: LocalDateTime = now()
)
