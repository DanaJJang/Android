package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_choice.*

class ChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)


        koreanteststart.setOnClickListener(){
          val intent = Intent(this, MeaningTestActivity::class.java)
          startActivity(intent)
      }

      englishteststart.setOnClickListener(){
      val intent = Intent(this, EnglishTestActivity::class.java)
          startActivity(intent)
      }
    }
}