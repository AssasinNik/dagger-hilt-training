package com.example.dagger_hilt_training.data.repository

import com.example.dagger_hilt_training.data.remote.MyApi
import com.example.dagger_hilt_training.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi
): MyRepository {

    override suspend fun getTestCall() {
        TODO("Not yet implemented")
    }
}