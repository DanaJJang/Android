package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.danajjang.Auth
import com.example.danajjang.NetRetrofit
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_signup.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //회원 가입을 눌렀을때
        signup_btn.setOnClickListener(){
            val auth = Auth(signup_user_id.text.toString(), signup_user_pw.text.toString())
            Log.e("sdfa",auth.id)
            Log.e("sdfa",auth.password)

            val response: Call<Void> = NetRetrofit().getService().postSignUp(auth)

            //비밀번호 글자수 제한
            if(signup_user_pw.length() in 13 downTo 8 ) {
                if (signup_user_pw.text.toString() == signup_user_pw_check.text.toString()) {
                    response.enqueue(object : Callback<Void> {
                        override fun onResponse(call: Call<Void>, response: Response<Void>) {
                            if (response.code() == 200) {
                                Toast.makeText(
                                    applicationContext,
                                    "가입이 완료되었습니다",
                                    Toast.LENGTH_SHORT

                                )
                                    .show()
                                val intent = Intent(applicationContext, SignInActivity::class.java)
                                startActivity(intent)
                            }
                        }

                        override fun onFailure(call: Call<Void>, t: Throwable) {
                            Log.e("sdfa", t.message.toString())
                        }


                    })
                } else Toast.makeText(this, "비번 틀렸어요", Toast.LENGTH_SHORT).show()
                }else passworderror_tv.visibility
            Log.e("오류 내용 나오기",toString())

            val intent=Intent(this,AddWordPadActivity::class.java)
            startActivity(intent)

            }
        }


    }
