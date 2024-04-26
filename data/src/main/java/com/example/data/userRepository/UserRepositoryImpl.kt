package com.example.data.userRepository

import com.example.data.storage.UserStorage
import com.example.data.storage.mapper.mapper
import com.example.domain.models.SaveUserNameParam
import com.example.domain.models.UserName
import com.example.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun getUser(): UserName {
        return userStorage.getUser().mapper()
    }

    override fun setUser(param: SaveUserNameParam): Boolean {
        return userStorage.saveUser(user = param.mapper())
    }
}