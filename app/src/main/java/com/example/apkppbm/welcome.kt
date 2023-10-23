package com.example.apkppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val register1= findViewById<Button>(R.id.register)
        register1.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
            }
        val login1= findViewById<Button>(R.id.login)
        login1.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}