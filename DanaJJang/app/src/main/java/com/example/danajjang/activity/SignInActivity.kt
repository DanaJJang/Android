package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.danajjang.API.Token
import com.example.danajjang.API.Auth
import com.example.danajjang.API.NetRetrofit
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_signin.*
import retrofit2.Call

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("asdfdsaf","signin")
        setContentView(R.layout.activity_signin)

        val sign = Auth(id.text.toString(),pw.text.toString())


        val response : Call<Token> = NetRetrofit().getService().postSignIn(sign)



        button.setOnClickListener(){
           val intent= Intent(applicationContext, AddWordPadActivity::class.java)
            startActivity(intent)
        }
        signinword.setOnClickListener(){
            val intent= Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}