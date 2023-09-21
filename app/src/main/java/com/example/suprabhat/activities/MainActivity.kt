package com.example.suprabhat.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.viewpager.widget.ViewPager
import com.example.suprabhat.R
import com.example.suprabhat.adapters.ViewPagerAdapter
import com.example.suprabhat.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val tab = findViewById<TabLayout>(R.id.tab)
        val viewPager = findViewById<ViewPager>(R.id.viewpager)

        val adapter = ViewPagerAdapter(supportFragmentManager)

        viewPager.adapter = adapter

        tab.setupWithViewPager(viewPager)

        binding.usernameShow.text = "Vandan Nandwana"






        binding.usernameShow.setOnClickListener{
            val dBuilder = AlertDialog.Builder(this)
            dBuilder.setTitle("Logout")
            dBuilder.setMessage("Do you really want to logout!!!")
            dBuilder.setPositiveButton("YES") {dialog, _ ->

                val editor = sharedPreferences.edit()
                editor.putBoolean("IsLoggedIn",false)
                editor.apply()

                intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()

                dialog.dismiss()

             }
            dBuilder.setNegativeButton("NO"){dialog, _ ->



                dialog.dismiss()

        }

            val alertDialog = dBuilder.create()
            alertDialog.show()
    }




    }
}