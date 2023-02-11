package com.mahmoud.zaher.domain.repo

import com.mahmoud.zaher.domain.entity.CategoryResponse

interface MealsRepo {
   suspend fun getMealsFromRemote(): CategoryResponse
}
