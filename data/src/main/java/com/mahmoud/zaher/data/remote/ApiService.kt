package com.mahmoud.zaher.data.remote

import com.mahmoud.zaher.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse
}
