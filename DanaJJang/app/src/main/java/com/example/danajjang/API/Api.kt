package com.example.danajjang.API

import com.example.danajjang.RecyclerView.Word
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface Api{

    @POST("/user")
    fun postSignUp(@Body auth: Auth): Call<Void>

    @POST("/auth")
    fun postSignIn(@Body auth: Auth) : Call<Token>

    @POST("/and/word")
    fun postSignWord(@Body word: Word) : Call<Void>






}