package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.danajjang.R
import com.example.danajjang.recycerview.Adapter
import com.example.danajjang.recycerview.Dictionary
import kotlinx.android.synthetic.main.activity_signword.*
import kotlinx.android.synthetic.main.activity_test.*
import kotlinx.android.synthetic.main.item_list.*

class SignWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signword)

        val adapter: Adapter = Adapter(arrayListOf())
        val count = intent.extras!!.get("wordCount") as Int
        for (i in 1..count ){
            adapter.add(Dictionary("", ""))

        }

        word_recyclerView.layoutManager = LinearLayoutManager(this)
        word_recyclerView.adapter = adapter
        plusword.setOnClickListener {
            adapter.add(Dictionary("", ""))

        }
    }


}