package com.example.dagger_hilt_training.di

import com.example.dagger_hilt_training.data.repository.MyRepositoryImpl
import com.example.dagger_hilt_training.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ):MyRepository

}