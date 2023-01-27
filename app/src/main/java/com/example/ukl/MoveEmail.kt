package com.example.ukl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_email)
        val tvDataReceived : TextView = findViewById(R.id.btn_move_email)

        val email = intent.getStringExtra(EXTRA_EMAIL)

        val text = "Email : $email"
        tvDataReceived.text = text
    }
    companion object {
        const val EXTRA_EMAIL = "extra_email"
    }
}