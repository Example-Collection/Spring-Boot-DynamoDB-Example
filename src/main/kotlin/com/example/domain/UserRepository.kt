package com.example.domain

import org.socialsignin.spring.data.dynamodb.repository.EnableScan
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
@EnableScan
interface UserRepository : CrudRepository<User, String>
