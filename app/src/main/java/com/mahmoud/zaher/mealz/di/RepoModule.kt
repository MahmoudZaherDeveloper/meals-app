package com.mahmoud.zaher.mealz.di

import com.mahmoud.zaher.data.remote.ApiService
import com.mahmoud.zaher.data.repo.MealsRepoImpl
import com.mahmoud.zaher.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo{
        return MealsRepoImpl(apiService)
    }
}
