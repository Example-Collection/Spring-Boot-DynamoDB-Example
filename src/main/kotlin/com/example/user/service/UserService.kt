package com.example.user.service

import com.example.user.dto.UserSignupRequestDto
import com.example.user.dto.UserSignupResponseDto

interface UserService {
    fun signup(dto: UserSignupRequestDto): UserSignupResponseDto
}
