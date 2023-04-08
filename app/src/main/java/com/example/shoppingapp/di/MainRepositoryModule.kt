package com.example.shoppingapp.di

import com.example.shoppingapp.remote.MainService
import com.example.shoppingapp.remote.repository.MainRepository
import com.example.shoppingapp.remote.repository.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MainRepositoryModule {

    @ViewModelScoped
    @Provides
    fun providesMainReposotory(
        mainService: MainService
    ) : MainRepository = MainRepositoryImpl(mainService)
}