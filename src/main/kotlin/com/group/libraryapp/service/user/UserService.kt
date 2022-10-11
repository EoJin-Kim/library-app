package com.group.libraryapp.service.user

import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.user.request.UserCreateRequest
import com.group.libraryapp.dto.user.request.UserUpdateRequest
import com.group.libraryapp.dto.user.response.UserResponse
import com.group.libraryapp.util.fail
import com.group.libraryapp.util.findByIdOrThrow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService @Autowired constructor(
    private val userRepository: UserRepository,
) {

    @Transactional
    fun saveUser(request: UserCreateRequest) {
        val newUser = User(request.name,request.age)
        userRepository.save(newUser)

    }

    @Transactional(readOnly = true)
    fun getUsers() : List<UserResponse>{
        return userRepository.findAll().map (::UserResponse)
    }

    @Transactional
    fun updateUserName(request: UserUpdateRequest) {
        val user = userRepository.findByIdOrThrow(request.id)
        user.updateName(request.name)
    }

    @Transactional
    fun deleteUser(name:String){
        val user = userRepository.findByName(name) ?: fail()
        userRepository.delete(user)
    }
}