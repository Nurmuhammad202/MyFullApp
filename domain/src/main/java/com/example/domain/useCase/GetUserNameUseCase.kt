package com.example.domain.useCase

import com.example.domain.models.UserName
import com.example.domain.repository.UserRepository

class GetUserNameUseCase(private val repository: UserRepository) {

    fun execute(): UserName {
        return repository.getUser()
    }
}