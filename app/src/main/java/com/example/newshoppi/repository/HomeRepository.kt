package com.example.newshoppi.repository

import com.example.newshoppi.model.HomeData

class HomeRepository(
    private  val assetDataSource: HomeAssetDataSource
){
    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}