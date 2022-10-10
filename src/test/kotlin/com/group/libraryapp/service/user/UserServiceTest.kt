package com.group.libraryapp.service.user

import com.group.libraryapp.domain.user.UserRepository
import org.springframework.beans.factory.annotation.Autowired

class UserServiceTest @Autowired constructor(
    private val userRepository :UserRepository,
    private val userService : UserService
) {
}