package com.example.data.storage.mapper

import com.example.data.storage.model.User
import com.example.domain.models.UserName

fun User.mapper(): UserName {
    return UserName(firstName = this.firstName.toString())
}