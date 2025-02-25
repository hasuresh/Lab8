package com.myapplication.lab8


import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create

class PhotoRepository {
    private val flicker: Flicker

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://www.flickr.com")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()

        flicker = retrofit.create<Flicker>()
    }
    suspend fun fetchContents() = flicker.fetchContents()

}
