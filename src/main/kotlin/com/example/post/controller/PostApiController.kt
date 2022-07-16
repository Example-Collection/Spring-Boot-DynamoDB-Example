package com.example.post.controller

import com.example.post.controller.request.PostCreateRequest
import com.example.post.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/post")
class PostApiController(
    private val postService: PostService
) {
    @PostMapping
    fun signup(@RequestBody request: PostCreateRequest) = postService.create(request)

    @GetMapping("/user/{userId}")
    fun findByUserId(@PathVariable("userId") userId: String) = postService.findByUserId(userId)

    @GetMapping("/title")
    fun findByTitle(@RequestParam("title") title: String) = postService.findByTitle(title)
}
