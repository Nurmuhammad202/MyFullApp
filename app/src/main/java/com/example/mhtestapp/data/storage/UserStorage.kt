package com.example.mhtestapp.data.storage

import com.example.mhtestapp.data.storage.model.User
import com.example.mhtestapp.domain.models.SaveUserNameParam
import com.example.mhtestapp.domain.models.UserName

interface UserStorage {

    fun saveUser(user: User): Boolean

    fun getUser(): User
}