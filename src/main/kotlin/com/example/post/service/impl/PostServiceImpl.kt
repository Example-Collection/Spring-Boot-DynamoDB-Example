package com.example.post.service.impl

import com.example.post.controller.request.PostCreateRequest
import com.example.post.controller.response.PostCreateResponse
import com.example.post.domain.Post
import com.example.post.domain.PostRepository
import com.example.post.service.PostService
import org.springframework.stereotype.Service

@Service
class PostServiceImpl(
    private val postRepository: PostRepository
) : PostService {
    override fun create(request: PostCreateRequest): PostCreateResponse {
        val user = postRepository.save(
            Post(
                title = request.title,
                content = request.content,
                userId = request.userId
            )
        )
        return PostCreateResponse.from(user)
    }

    override fun findByUserId(userId: String): List<Post> {
        return postRepository.findByUserIdOrderByCreatedAtAsc(userId)
    }

    override fun findByTitle(userId: String): List<Post> {
        return postRepository.findByTitleOrderByCreatedAtDesc(userId)
    }
}
