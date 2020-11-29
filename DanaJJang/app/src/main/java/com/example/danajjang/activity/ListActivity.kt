package com.example.danajjang.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        //세개가 다  입력 했을시에 버튼이 떠오른다.
        val textWatcher = object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (namein_tv.text!=null && datein_tv.text!=null && num_tv.text!=null){
                    testin_btn.visibility= View.VISIBLE
                }
                else{
                    testin_btn.visibility = View.INVISIBLE

                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        }
        namein_tv.addTextChangedListener(textWatcher)
        datein_tv.addTextChangedListener(textWatcher)
        num_tv.addTextChangedListener(textWatcher)

            testin_btn.setOnClickListener(){
                val intent = Intent(this,SignWordActivity::class.java)
                startActivity(intent)
            }

    }

}
