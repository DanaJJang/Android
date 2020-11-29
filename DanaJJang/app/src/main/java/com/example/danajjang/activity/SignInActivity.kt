package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("asdfdsaf","signin")
        setContentView(R.layout.activity_sign_in)

        button.setOnClickListener(){
           val intent= Intent(applicationContext, AddWordPadActivity::class.java)
            startActivity(intent)
        }
        sign.setOnClickListener(){
            val intent= Intent(applicationContext, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}