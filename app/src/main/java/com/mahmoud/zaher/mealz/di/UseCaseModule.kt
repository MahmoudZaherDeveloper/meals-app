package com.mahmoud.zaher.mealz.di

import com.mahmoud.zaher.domain.repo.MealsRepo
import com.mahmoud.zaher.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(repo: MealsRepo): GetMeals {
        return GetMeals(repo)
    }
}
