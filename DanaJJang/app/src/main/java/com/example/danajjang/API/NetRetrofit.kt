package com.example.danajjang.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetRetrofit{
    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl("http://10.156.147.203:1")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getService() : Api {
        return retrofit.create(Api::class.java)
    }
}