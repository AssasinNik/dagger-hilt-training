package com.example.dagger_hilt_training.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("test")
    suspend fun getTestCall()
}