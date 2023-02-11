package com.mahmoud.zaher.data.repo

import com.mahmoud.zaher.data.remote.ApiService
import com.mahmoud.zaher.domain.entity.CategoryResponse
import com.mahmoud.zaher.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}
