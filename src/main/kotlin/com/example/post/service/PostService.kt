package com.example.post.service

import com.example.post.controller.request.PostCreateRequest
import com.example.post.controller.response.PostCreateResponse
import com.example.post.domain.Post

interface PostService {
    fun create(request: PostCreateRequest): PostCreateResponse
    fun findByUserId(userId: String): List<Post>
    fun findByTitle(userId: String): List<Post>
}
