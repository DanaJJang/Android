package com.example.danajjang.API

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.danajjang.R

class Adapter(val adapterList:ArrayList<Dictionary>):RecyclerView.Adapter<Adapter.CustomViewHolder>(){

    fun add(item : Dictionary){
        adapterList.add(item)
        notifyDataSetChanged()

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return CustomViewHolder(view)

        }

    public fun setDictionary(word : String, meaning : String){

        //adapterList[]

    }

    override fun getItemCount(): Int {
        return adapterList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.meaning.text = adapterList.get(position).meaning
        holder.word.text = adapterList.get(position).word

    }


    class CustomViewHolder(view : View): RecyclerView.ViewHolder(view){
        val word : TextView = view.findViewById<TextView>(R.id.Word_tv)
        val meaning : TextView = view.findViewById<TextView>(R.id.meaning_tv)
    }

}




