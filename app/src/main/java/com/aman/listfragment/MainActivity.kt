package com.aman.listfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var array = arrayOf("first", "second", "third")
    lateinit var arrayAdapter: Adapter
    lateinit var list: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = findViewById(R.id.listView)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, array)
        list.adapter = arrayAdapter as ArrayAdapter<String>
        list.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"${array.get(position)}",Toast.LENGTH_LONG).show()
         
        }
        list.setOnScrollChangeListener { view, i, i2, i3, i4 ->  }


    }
}