package com.example.ukl

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val email = findViewById<TextView>(R.id.tvEmail)
        val data = intent.getStringExtra("email").toString()
        email.text = data
    }
}
