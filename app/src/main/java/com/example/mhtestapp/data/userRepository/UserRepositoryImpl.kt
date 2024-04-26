package com.example.mhtestapp.data.userRepository

import com.example.mhtestapp.data.storage.UserStorage
import com.example.mhtestapp.data.storage.mapper.mapper
import com.example.mhtestapp.domain.models.SaveUserNameParam
import com.example.mhtestapp.domain.models.UserName
import com.example.mhtestapp.domain.repository.UserRepository


class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun getUser(): UserName {
        return userStorage.getUser().mapper()
    }

    override fun setUser(param: SaveUserNameParam): Boolean {
        return userStorage.saveUser(user = param.mapper())
    }
}