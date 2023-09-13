package com.example.suprabhat.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.suprabhat.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val sigup_text = findViewById<TextView>(R.id.signup_textview)
        sigup_text.setOnClickListener{
            intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}