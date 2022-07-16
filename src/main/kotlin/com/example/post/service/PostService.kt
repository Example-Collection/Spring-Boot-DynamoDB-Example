package com.example.post.service

import com.example.post.controller.request.PostCreateRequest
import com.example.post.controller.response.PostCreateResponse

interface PostService {
    fun create(dto: PostCreateRequest): PostCreateResponse
}
