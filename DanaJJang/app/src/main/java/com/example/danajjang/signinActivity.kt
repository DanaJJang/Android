package com.example.danajjang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*
import kotlinx.android.synthetic.main.fragment_addwordpad.*

class signinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //이제 회원가입이 완료되면 워드 패드를 추가하는 프레그 먼트로 이동한다.

        signbutton.setOnClickListener(){
                val intent= Intent(this,addwordpad::class.java)
                startActivity(intent)
            }
        }


    }
