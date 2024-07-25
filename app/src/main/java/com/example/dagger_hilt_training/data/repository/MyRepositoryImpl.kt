package com.example.dagger_hilt_training.data.repository

import android.app.Application
import com.example.dagger_hilt_training.R
import com.example.dagger_hilt_training.data.remote.MyApi
import com.example.dagger_hilt_training.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {

        val appName = appContext.getString(R.string.app_name)
        println("Hello this is $appName")

    }

    override suspend fun getTestCall() {
    }
}