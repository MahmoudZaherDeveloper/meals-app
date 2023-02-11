package com.mahmoud.zaher.mealz

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mahmoud.zaher.mealz.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mealsViewModel: MealsViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mealsAdapter = MealsAdapter()
        lifecycleScope.launchWhenStarted {
            mealsViewModel.categoryResponse.collect {
                mealsAdapter.submitList(it?.categories)
                binding.rvCategories.adapter = mealsAdapter
            }
        }
    }
}
