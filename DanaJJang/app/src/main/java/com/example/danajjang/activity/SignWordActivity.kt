package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.danajjang.R
import com.example.danajjang.API.Adapter
import com.example.danajjang.API.Dictionary
import kotlinx.android.synthetic.main.activity_signword.*

class SignWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signword)


        val list = arrayListOf<Dictionary>()
        val adapter: Adapter = Adapter(list)
        val count = intent.extras!!.get("wordCount") as Int
        for (i in 1..count) {
            adapter.add(Dictionary("", ""))

        }

        word_recyclerView.layoutManager = LinearLayoutManager(this)
        word_recyclerView.adapter = adapter
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



