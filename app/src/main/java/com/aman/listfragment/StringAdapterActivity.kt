package com.aman.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class StringAdapterActivity : AppCompatActivity() {
    var array : ArrayList<String> = ArrayList()
    lateinit var arrayAdapter: Adapter
    lateinit var list: ListView
    var listLength = 25
    private val TAG = "StringAdapterActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string_adapter)
        list = findViewById(R.id.listView)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, array)
        for (i in 0..listLength){
            array.add("Item at "+i)
        }
        list.adapter = arrayAdapter as ArrayAdapter<String>
        list.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"${array.get(position)}",Toast.LENGTH_LONG).show()
         
        }

    }
}