package com.example.danajjang.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_addwordpad.*
import kotlinx.android.synthetic.main.activity_list.*


class AddWordPadActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addwordpad)

        addwordpad.setOnClickListener(){
            val intent= Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }

}