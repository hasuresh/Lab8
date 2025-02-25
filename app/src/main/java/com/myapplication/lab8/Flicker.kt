package com.myapplication.lab8
import retrofit2.http.GET
interface Flicker {
    @GET("/")
    suspend fun fetchContents(): String
}