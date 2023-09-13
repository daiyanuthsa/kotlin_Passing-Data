package com.example.tugas2_papb

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val uname = findViewById<EditText>(R.id.unameInput)
        val pass = findViewById<EditText>(R.id.passInput)
        val passLayout = findViewById<TextInputLayout>(R.id.passLayout)
        val unameLayout = findViewById<TextInputLayout>(R.id.unameLayout)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnSignUp =findViewById<Button>(R.id.btnSignUp)

        btnLogin.setOnClickListener {
            val username = uname.text.toString()
            val password = pass.text.toString()

            if (username.length < 1){
                unameLayout.error = "Usermane must fullfiled"
            }else{
                unameLayout.error = null
                if (password.length < 1){
                    passLayout.error = "Input you're password"
                }else{
                    passLayout.error = null
                    Intent(this, SecondActivity::class.java).also {
                        it.putExtra("EXTRA_USERNAME", username)
                        it.putExtra("EXTRA_PASSWORD", password)
                        startActivity(it)
                    }
                }
            }

        }

        btnSignUp.setOnClickListener {
            Intent(this, SignUpActivity::class.java).also {
                startActivity(it)
            }
        }



    }
}