package com.aman.listfragment

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(var users: ArrayList<User>) :BaseAdapter(){
    override fun getCount(): Int {
      return users.size
    }

    override fun getItem(position: Int): Any {
        return users.get(position)

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
        var initView = LayoutInflater.from(parent?.context).inflate(R.layout.layout_adapter,parent, false)
        var userName = initView.findViewById<TextView>(R.id.tvName)
        var rollNo = initView.findViewById<TextView>(R.id.tvRollno)
        Log.e("TAG", " users[position].name?: ${users[position].name?:""}")
        userName.setText(users[position].name?:"")
        rollNo.setText((users[position].rollNo?:"").toString())
        return initView
    }
}