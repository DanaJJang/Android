package com.example.danajjang

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api{

    @POST("/user")
    fun postSignUp(@Body auth: Auth): Call<Void>
}