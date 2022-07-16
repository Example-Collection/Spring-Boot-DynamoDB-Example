package com.example.post.controller.request

data class PostCreateRequest(
    val title: String,
    val content: String,
    val userId: String
)
