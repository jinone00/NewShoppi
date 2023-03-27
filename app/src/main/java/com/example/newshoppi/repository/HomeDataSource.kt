package com.example.newshoppi.repository

import com.example.newshoppi.model.HomeData

// 여러 형태의 Data를 가지기 때문에 필요한 인터페이스

interface HomeDataSource{
    fun getHomeData(): HomeData?
}
