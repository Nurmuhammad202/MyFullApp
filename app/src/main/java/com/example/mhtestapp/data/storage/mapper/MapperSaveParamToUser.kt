package com.example.mhtestapp.data.storage.mapper

import com.example.mhtestapp.data.storage.model.User
import com.example.mhtestapp.domain.models.SaveUserNameParam

fun SaveUserNameParam.mapper(): User {
    return User(this.firstName)
}