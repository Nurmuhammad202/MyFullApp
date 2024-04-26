package com.example.data.storage

import com.example.data.storage.model.User

interface UserStorage {

    fun saveUser(user: User): Boolean

    fun getUser(): User
}