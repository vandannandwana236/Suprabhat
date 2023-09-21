package com.example.suprabhat.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.suprabhat.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {
    private lateinit var auth :FirebaseAuth
    private lateinit var database: FirebaseDatabase
    private lateinit var databaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val loginTextview = findViewById<TextView>(R.id.login_text)
        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        databaseReference = database.getReference("User")
        val username = findViewById<EditText>(R.id.signup_user_name)


        val signupButton = findViewById<Button>(R.id.signup_button)

        signupButton.setOnClickListener {
            val email = findViewById<TextView>(R.id.signup_user_email).text
            val password = findViewById<TextView>(R.id.signup_user_password).text

            auth.createUserWithEmailAndPassword(email.toString(),password.toString())
                .addOnCompleteListener(this) {task->
                    if(task.isSuccessful){
                        Toast.makeText(this,"Account Created Succesfull",Toast.LENGTH_SHORT).show()

                        val data  = Name(username.text.toString())
                        databaseReference.push().setValue(data)
                            .addOnSuccessListener {
                                Toast.makeText(this,"Data added",Toast.LENGTH_SHORT).show()
                            }
                            .addOnFailureListener {
                                Toast.makeText(this,"Data Not added",Toast.LENGTH_SHORT).show()
                            }


                    }
                    else{
                        Toast.makeText(this,"Account Created Not Succesfull",Toast.LENGTH_SHORT).show()
                    }
                }
        }

        loginTextview.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

data class Name(val username:String)