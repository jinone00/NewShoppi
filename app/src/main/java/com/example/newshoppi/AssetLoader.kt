package com.example.newshoppi

import android.content.Context
import android.util.Log

class AssetLoader(private val context: Context ) {

    fun getJsonString(fileName: String): String? {
        return kotlin.runCatching{
            loadAsset(fileName)
        }.getOrNull()
    }

    private fun loadAsset(fileName: String) : String {
        return context.assets.open(fileName).use{ inputStream ->
            val size = inputStream.available()
            val bytes = ByteArray(size)
            inputStream.read(bytes)
            String(bytes)
        }
    }
}