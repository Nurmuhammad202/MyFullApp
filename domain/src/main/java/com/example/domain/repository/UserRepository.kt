package com.example.domain.repository

import com.example.domain.models.SaveUserNameParam
import com.example.domain.models.UserName

interface UserRepository {

    fun getUser(): UserName

    fun setUser(param: SaveUserNameParam): Boolean
}