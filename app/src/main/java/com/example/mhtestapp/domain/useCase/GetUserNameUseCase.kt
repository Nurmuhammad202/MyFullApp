package com.example.mhtestapp.domain.useCase

import com.example.mhtestapp.domain.models.UserName
import com.example.mhtestapp.domain.repository.UserRepository

class GetUserNameUseCase(private val repository: UserRepository) {

    fun execute(): UserName {
        return repository.getUser()
    }
}