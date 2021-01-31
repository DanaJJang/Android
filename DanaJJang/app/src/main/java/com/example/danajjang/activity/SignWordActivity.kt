package com.example.danajjang.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.danajjang.R
import com.example.danajjang.API.Adapter
import com.example.danajjang.API.NetRetrofit
import com.example.danajjang.API.Word
import kotlinx.android.synthetic.main.activity_signword.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import java.util.Dictionary as Dictionary

class SignWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signword)


        val list = arrayListOf<Word>()
        val adapter: Adapter = Adapter(list)
        val count = intent.extras!!.get("wordCount") as Int
        for (i in 1..count) {
            adapter.add(Word())

        }

        word_recyclerView.layoutManager = LinearLayoutManager(this)
        word_recyclerView.adapter = adapter


        Registration.setOnClickListener {

            val Word = adapter.adapterList
            for (i in Word) {
                val response: Call<Void> = NetRetrofit().getService().postSignWord(i)
                response.enqueue(object : Callback<Void> {
                    override fun onResponse(call: Call<Void>, response: Response<Void>) {
                        if (response.code() == 201) {
                            Toast.makeText(applicationContext, "단어 등록에 성공하였습니다", Toast.LENGTH_SHORT)
                                .show()
                        } else if (response.code() == 400) {
                            Toast.makeText(applicationContext, "단어 등록에 실패하였습니다", Toast.LENGTH_SHORT)
                                .show()
                        } else if (response.code() == 404) {
                            Toast.makeText(applicationContext, "존재하지 않은 폴더 입니다", Toast.LENGTH_SHORT)
                                .show()
                        } else if (response.code() == 409) {
                            Toast.makeText(applicationContext, "중복된 단어 입니다", Toast.LENGTH_SHORT)
                                .show()
                        }

                    }

                    override fun onFailure(call: Call<Void>, t: Throwable) {

                    }
                })
            }
        }
    }
}

