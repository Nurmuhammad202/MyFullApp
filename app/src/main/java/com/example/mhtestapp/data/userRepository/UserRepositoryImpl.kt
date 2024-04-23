package com.example.mhtestapp.data.userRepository

import android.content.Context
import android.content.SharedPreferences
import com.example.mhtestapp.domain.models.SaveUserNameParam
import com.example.mhtestapp.domain.models.UserName
import com.example.mhtestapp.domain.repository.UserRepository

private const val SHARED_PREF_NAME = "shared_pref_name"
private const val KEY_FIRST_NAME = "firstName"
private const val DEFAULT_NAME = "default name"

class UserRepositoryImpl(context: Context) : UserRepository {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)

    override fun getUser(): UserName {
        val firstName = sharedPreferences.getString(KEY_FIRST_NAME, DEFAULT_NAME) ?: DEFAULT_NAME
        return UserName(firstName = firstName)
    }

    override fun setUser(param: SaveUserNameParam): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, param.firstName).apply()
        return true
    }
}