package com.example.user.dto

import com.example.domain.User
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class UserSignupResponseDto(
    val userId: String,
    val nickname: String,
    @field:JsonFormat(pattern = "yyyy-MM-dd")
    val createdAt: LocalDateTime
) {
    companion object {
        fun from(user: User) = UserSignupResponseDto(
            userId = user.id!!,
            nickname = user.nickname,
            createdAt = user.createdAt
        )
    }
}
