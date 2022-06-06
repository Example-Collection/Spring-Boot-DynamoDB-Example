package com.example.user.dto

import com.example.domain.User

data class UserSignupRequestDto(
    val nickname: String
) {
    fun toEntity() = User(nickname = nickname)
}
