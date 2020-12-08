package com.example.danajjang.API

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api{

    @POST("/user")
    fun postSignUp(@Body auth: Auth): Call<Void>

    @POST("/auth")
    fun postSignIn(@Body auth: Auth) : Call<Token>

    @POST("/word")
    fun postSignWord(@Body word: Word) : Call<Void>
}