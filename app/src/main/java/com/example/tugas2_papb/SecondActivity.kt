package com.example.tugas2_papb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val resultUsername = findViewById<TextView>(R.id.resultUsername)
        val resultPassword = findViewById<TextView>(R.id.resultPassword)

        val uname = intent.getStringExtra("EXTRA_USERNAME")
        val pass = intent.getStringExtra("EXTRA_PASSWORD")

        resultUsername.text = uname
        resultPassword.text = pass
    }
}