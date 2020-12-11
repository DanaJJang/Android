package com.example.danajjang.API

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.danajjang.R

class Adapter(val adapterList:ArrayList<Word>):RecyclerView.Adapter<Adapter.CustomViewHolder>(){

    fun add(item: Word){
        adapterList.add(item)
        notifyDataSetChanged()

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return CustomViewHolder(view)

        }


    override fun getItemCount(): Int {
        return adapterList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.meaning.text = adapterList.get(position).Korean
        holder.word.text = adapterList.get(position).english

    }




    class CustomViewHolder(view : View): RecyclerView.ViewHolder(view){
        val word : TextView = view.findViewById<TextView>(R.id.Word_tv)
        val meaning : TextView = view.findViewById<TextView>(R.id.Meaning_tv)
    }

}




