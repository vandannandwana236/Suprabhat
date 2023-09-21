package com.example.suprabhat.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.suprabhat.R
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth = FirebaseAuth.getInstance()
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        if(sharedPreferences.getBoolean("IsLoggedIn",false)){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val sigupText = findViewById<TextView>(R.id.signup_text)

        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {
            val email = findViewById<TextView>(R.id.login_user_email).text
            val password = findViewById<TextView>(R.id.login_user_password).text
            auth.signInWithEmailAndPassword(email.toString(), password.toString())
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()

                        val editor = sharedPreferences.edit()
                        editor.putBoolean("IsLoggedIn",true)
                        editor.apply()

                        intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()


                    } else {
                        Toast.makeText(this, "Login Not Successful", Toast.LENGTH_LONG).show()
                    }
                }
        }

        sigupText.setOnClickListener {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}