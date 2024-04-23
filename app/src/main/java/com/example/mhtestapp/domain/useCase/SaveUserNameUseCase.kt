package com.example.mhtestapp.domain.useCase

import com.example.mhtestapp.domain.models.SaveUserNameParam
import com.example.mhtestapp.domain.repository.UserRepository

class SaveUserNameUseCase(private val repository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {
        return repository.setUser(param = param)
    }
}