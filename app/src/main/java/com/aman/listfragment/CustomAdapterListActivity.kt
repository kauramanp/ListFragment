package com.aman.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlin.random.Random

class CustomAdapterListActivity : AppCompatActivity() {
    lateinit var list:ListView
    lateinit var listAdapter: ListAdapter
    var userList: ArrayList<User> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_adapter_list)
        list = findViewById(R.id.listView)
        for(i in 0..20){
            userList.add(User(randomString(4), i))
        }
        listAdapter = ListAdapter(userList)
        list.adapter = listAdapter
    }

    fun randomString(length: Int): String =
        buildString {
            repeat(length) {
                append((0 until 36).random().toString(36))
            }
        }
}