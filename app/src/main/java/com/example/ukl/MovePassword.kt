package com.example.ukl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MovePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_password)

        val tvDataReceived : TextView = findViewById(R.id.btn_move_password)

        val password = intent.getStringExtra(EXTRA_PASSWORD)

        val text = "Password : $password"
        tvDataReceived.text = text
    }
    companion object {
        const val EXTRA_PASSWORD = "extra_password"
    }
}