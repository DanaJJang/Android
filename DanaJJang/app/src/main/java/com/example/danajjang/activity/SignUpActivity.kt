package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
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

        //이제 회원가입이 완료되면 워드 패드를 추가하는 프레그 먼트로 이동한다.

        signup_btn.setOnClickListener(){
            val auth = Auth(signup_user_id.text.toString(), signup_user_pw.text.toString())
            Log.e("sdfa",auth.id)
            Log.e("sdfa",auth.password)

            val response: Call<Void> = NetRetrofit().getService().postSignUp(auth)

            if(signup_user_pw.text.toString() == signup_user_pw_check.text.toString()){
                response.enqueue(object: Callback<Void> {
                    override fun onResponse(call: Call<Void>, response: Response<Void>) {
                        if(response.code() == 200){
                            Toast.makeText(applicationContext,"가입이 완료되었습니다",Toast.LENGTH_SHORT).show()


                        }
                    }
                    override fun onFailure(call: Call<Void>, t: Throwable) {
                        Log.e("sdfa",t.message.toString())
                    }
                })
                val intent= Intent(this@SignUpActivity, SignInActivity::class.java)
                startActivity(intent)
            }else passworderror_tv.visibility = View.VISIBLE

        }
    }


}