package com.example.mhtestapp.data.storage

import android.content.Context
import android.content.SharedPreferences
import com.example.mhtestapp.data.storage.model.User
import com.example.mhtestapp.domain.models.SaveUserNameParam
import com.example.mhtestapp.domain.models.UserName

private const val SHARED_PREF_NAME = "shared_pref_name"
private const val KEY_FIRST_NAME = "firstName"
private const val DEFAULT_NAME = "default name"

class SharedPrefUserStorage(context: Context) : UserStorage {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)

    override fun getUser(): User {
        val firstName = sharedPreferences.getString(KEY_FIRST_NAME, DEFAULT_NAME) ?: DEFAULT_NAME
        return User(firstName = firstName)
    }

    override fun saveUser(user: User): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, user.firstName).apply()
        return true
    }
}