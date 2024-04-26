package com.example.mhtestapp.data.storage.mapper

import com.example.mhtestapp.data.storage.model.User
import com.example.mhtestapp.domain.models.UserName

fun User.mapper(): UserName {
    return UserName(firstName = this.firstName.toString())
}