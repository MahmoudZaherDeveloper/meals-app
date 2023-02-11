package com.mahmoud.zaher.domain.usecase

import com.mahmoud.zaher.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}