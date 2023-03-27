package com.example.newshoppi.repository

import com.example.newshoppi.AssetLoader
import com.example.newshoppi.model.HomeData
import com.google.gson.Gson

class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {

    private val gson = Gson()

    override fun getHomeData(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let{
            homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}