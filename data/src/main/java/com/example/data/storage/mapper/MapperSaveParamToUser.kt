package com.example.data.storage.mapper

import com.example.data.storage.model.User
import com.example.domain.models.SaveUserNameParam

fun SaveUserNameParam.mapper(): User {
    return User(this.firstName)
}