      package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.danajjang.API.Token
import com.example.danajjang.API.Auth
import com.example.danajjang.API.NetRetrofit
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_addwordpad.*
import kotlinx.android.synthetic.main.activity_signin.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        button.setOnClickListener(){
            val intent = Intent(this, addwordpad::class.java)
            startActivity(intent)
        }
        Log.d("asdfdsaf", "signin")
        setContentView(R.layout.activity_signin)


        signinword.setOnClickListener() {
            val intent = Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }


        button.setOnClickListener() {
            login(id.text.toString(), pw.text.toString())

        }
    }

        private fun login(id: String, password: String) {
            val auth = Auth(id, password)
            val response: Call<Token> = NetRetrofit().getService().postSignIn(auth)
            response.enqueue(object : Callback<Token> {
                override fun onResponse(call: Call<Token>, response: Response<Token>) {

                    if (response.code() == 201) {
                        Toast.makeText(applicationContext, "로그인에 성공했습니다", Toast.LENGTH_SHORT)
                            .show()

                        val intent = Intent(applicationContext, AddWordPadActivity::class.java)
                        startActivity(intent)


                    } else if (response.code() == 400) {
                        Toast.makeText(applicationContext, "로그인 실패하였습니다", Toast.LENGTH_SHORT)
                            .show()
                    }

                }

                override fun onFailure(call: Call<Token>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })

        }
    }


