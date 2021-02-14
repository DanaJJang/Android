package com.example.danajjang.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.danajjang.R
import com.example.danajjang.RecyclerView.Word
import com.example.danajjang.RecyclerView.WordAdapter
import kotlinx.android.synthetic.main.activity_signword.*

class SignWordActivity : AppCompatActivity() {

    var wordList = arrayListOf<Word>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signword)


            val mAdapter = WordAdapter(this, wordList)
            mRecyclerView.adapter = mAdapter

            val lm = LinearLayoutManager(this)
            mRecyclerView.layoutManager = lm
            mRecyclerView.setHasFixedSize(true)
        }

    }


