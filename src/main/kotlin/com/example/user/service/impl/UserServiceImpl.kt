package com.example.user.service.impl

import com.example.domain.UserRepository
import com.example.user.dto.UserSignupRequestDto
import com.example.user.dto.UserSignupResponseDto
import com.example.user.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {
    override fun signup(dto: UserSignupRequestDto): UserSignupResponseDto {
        val user = userRepository.save(dto.toEntity())
        return UserSignupResponseDto.from(user)
    }
}
