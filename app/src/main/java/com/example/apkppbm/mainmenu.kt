package com.example.apkppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class mainmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainmenu)
        val antarkota1= findViewById<CardView>(R.id.cvantarkota)
        antarkota1.setOnClickListener {
            val intent = Intent(this, pesanan::class.java)
            startActivity(intent)
        }
        val antarlokal1= findViewById<CardView>(R.id.cvlocal)
        antarlokal1.setOnClickListener {
            val intent = Intent(this, pesanan::class.java)
            startActivity(intent)
        }
        val antarcomputerline1= findViewById<CardView>(R.id.cvcomputerline)
        antarcomputerline1.setOnClickListener {
            val intent = Intent(this, pesanan::class.java)
            startActivity(intent)
        }
        val profile1= findViewById<ImageView>(R.id.imageProfile)
        profile1.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
    }
}