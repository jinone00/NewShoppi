package com.example.newshoppi.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newshoppi.model.Banner
import com.example.newshoppi.model.Title
import com.example.newshoppi.repository.HomeRepository

class HomeViewModel(private val homeRepository: HomeRepository) : ViewModel() {

    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title

    private val _topBanners = MutableLiveData<List<Banner>>()
    val topBanners: LiveData<List<Banner>> = _topBanners

    init {
        loadHomeData()
    }

    private fun loadHomeData(){
        val homeData = homeRepository.getHomeData()
        homeData?.let{ homeData ->
            _title.value = homeData.title
            _topBanners.value = homeData.topBanners
        }
    }
}