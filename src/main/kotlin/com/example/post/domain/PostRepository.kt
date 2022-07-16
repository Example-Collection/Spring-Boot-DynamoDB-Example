package com.example.post.domain

import org.socialsignin.spring.data.dynamodb.repository.EnableScan
import org.springframework.data.repository.CrudRepository

@EnableScan
interface PostRepository : CrudRepository<Post, String> {
    fun findByUserIdOrderByCreatedAtAsc(userId: String): List<Post>
    fun findByTitleOrderByCreatedAtDesc(title: String): List<Post>
}
