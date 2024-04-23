package com.example.mhtestapp.domain.useCase

import com.example.mhtestapp.domain.models.UserName

class GetUserNameUseCase {

    fun execute(): UserName {
        return UserName(name = "Hello")
    }
}