package com.aman.listfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnStringAdapter: Button
    lateinit var btnCustomAdapter: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStringAdapter = findViewById(R.id.btnStringAdapter)
        btnCustomAdapter = findViewById(R.id.btnBaseAdapter)

        btnStringAdapter.setOnClickListener {
            startActivity(Intent(this, StringAdapterActivity::class.java))
        }
        btnCustomAdapter.setOnClickListener {
            startActivity(Intent(this, CustomAdapterListActivity::class.java))
        }
    }
}