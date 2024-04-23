package com.example.mhtestapp.domain.repository

import com.example.mhtestapp.domain.models.SaveUserNameParam
import com.example.mhtestapp.domain.models.UserName

interface UserRepository {

    fun getUser(): UserName

    fun setUser(param: SaveUserNameParam): Boolean
}