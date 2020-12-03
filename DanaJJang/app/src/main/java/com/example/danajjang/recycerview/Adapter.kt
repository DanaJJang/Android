package com.example.danajjang.recycerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.danajjang.R
import kotlinx.android.synthetic.main.activity_signup.view.*
import kotlinx.android.synthetic.main.item_list.view.*

class Adapter(val AdapterList:ArrayList<Dictionary>):RecyclerView.Adapter<Adapter.CustomViewHolder>(){

    fun add(item : Dictionary){
        AdapterList.add(item)
        notifyDataSetChanged()

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return CustomViewHolder(view)

        }



    override fun getItemCount(): Int {
        return AdapterList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.meaning.text = AdapterList.get(position).meaning
        holder.word.text = AdapterList.get(position).word

    }


    class CustomViewHolder(view : View): RecyclerView.ViewHolder(view){
        val word : TextView = view.findViewById<TextView>(R.id.Word_tv)
        val meaning : TextView = view.findViewById<TextView>(R.id.meaning_tv)
    }

}




