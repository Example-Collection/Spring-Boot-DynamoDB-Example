package com.example.user.controller

import com.example.user.dto.UserSignupRequestDto
import com.example.user.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/user")
class UserApiController(
    private val userService: UserService
) {
    @PostMapping
    fun signup(@RequestBody dto: UserSignupRequestDto) = userService.signup(dto)
}
