package com.example.newshoppi.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newshoppi.AssetLoader
import com.example.newshoppi.repository.HomeAssetDataSource
import com.example.newshoppi.repository.HomeRepository
import com.example.newshoppi.ui.home.HomeViewModel

class ViewModelFactory(private val context: Context): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(HomeViewModel::class.java)){
            val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
            return HomeViewModel(repository) as T
        } else{
            throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
        }
    }
}