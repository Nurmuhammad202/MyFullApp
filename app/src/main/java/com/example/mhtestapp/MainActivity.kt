package com.example.mhtestapp

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mhtestapp.data.userRepository.UserRepositoryImpl
import com.example.mhtestapp.databinding.ActivityMainBinding
import com.example.mhtestapp.domain.models.SaveUserNameParam
import com.example.mhtestapp.domain.useCase.GetUserNameUseCase
import com.example.mhtestapp.domain.useCase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val repository by lazy { UserRepositoryImpl(context = applicationContext) }

    private val getUserNameUseCase by lazy { GetUserNameUseCase(repository = repository) }
    private val saveUserNameUseCase by lazy { SaveUserNameUseCase(repository = repository) }

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding?.root)

        saveUserNameUseCase.execute(param = SaveUserNameParam(firstName = "Android!!"))

        val userName = getUserNameUseCase.execute()
        Log.e(TAG, "onCreate: userName: ${userName.firstName}")

    }
}