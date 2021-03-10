package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.ImageView
import com.example.danajjang.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_choice.*
import kotlinx.android.synthetic.main.activity_main.*


@Suppress("DEPRECATION")

class MainActivity : AppCompatActivity() {
    //private lateinit  var mAuth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)


      /*  super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()
        val user = mAuth.currentUser


       */

        imageView3.setOnClickListener(){
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)

        }

        /*Handler().postDelayed(
        Handler().postDelayed({
            if(user != null) {
                val dashboardIntent = Intent(this,DashboardActivity::class.java)
                startActivity(dashboardIntent)
                finish()

            }

            else {
                val signInActivity = Intent(this,SignInActivity::class.java)
                startActivity(signInActivity)
                finish()

            }
        },2000)*/

    }
}