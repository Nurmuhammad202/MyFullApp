package com.example.domain.useCase

import com.example.domain.models.SaveUserNameParam
import com.example.domain.repository.UserRepository

class SaveUserNameUseCase(private val repository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        return repository.setUser(param = param)
    }
}