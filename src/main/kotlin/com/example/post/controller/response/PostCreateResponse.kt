package com.example.post.controller.response

import com.example.post.domain.Post
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class PostCreateResponse(
    val id: String,
    val title: String,
    val content: String,
    val userId: String,
    @field:JsonFormat(pattern = "yyyy-MM-dd")
    val createdAt: LocalDateTime
) {
    companion object {
        fun from(post: Post) = PostCreateResponse(
            id = post.id,
            title = post.title,
            content = post.content,
            userId = post.userId,
            createdAt = post.createdAt
        )
    }
}
