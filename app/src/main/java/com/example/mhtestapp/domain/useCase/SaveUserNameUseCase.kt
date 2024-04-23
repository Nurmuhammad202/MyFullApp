package com.example.mhtestapp.domain.useCase

import com.example.mhtestapp.domain.models.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(param: SaveUserNameParam): Boolean {
        return param.name.isNotEmpty()
    }
}