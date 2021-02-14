package com.example.danajjang.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.example.danajjang.R

class WordAdapter(val context: Context, val wordList : ArrayList<Word>):
    RecyclerView.Adapter<WordAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_signword, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(wordList[position], context)
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val English = itemView?.findViewById<EditText>(R.id.Eng_tv)
        val Meaning = itemView?.findViewById<EditText>(R.id.Meaning_tv)

        fun bind( word : Word, context: Context) {
            
            English?.text = word.English
            Meaning?.text =word.Meaning

        }
    }
}
