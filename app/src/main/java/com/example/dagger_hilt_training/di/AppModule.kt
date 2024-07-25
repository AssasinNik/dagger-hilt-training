package com.example.dagger_hilt_training.di

import com.example.dagger_hilt_training.data.remote.MyApi
import com.example.dagger_hilt_training.data.repository.MyRepositoryImpl
import com.example.dagger_hilt_training.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi{
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMyRepository(api: MyApi):MyRepository{
        return  MyRepositoryImpl(api)
    }

}