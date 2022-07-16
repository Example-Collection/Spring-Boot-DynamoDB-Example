package com.example.post.domain

import org.socialsignin.spring.data.dynamodb.repository.EnableScan
import org.springframework.data.repository.CrudRepository

@EnableScan
interface PostRepository : CrudRepository<Post, String>
