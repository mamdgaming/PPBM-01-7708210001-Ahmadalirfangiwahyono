package com.example.apkppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login2= findViewById<Button>(R.id.btn_login1)
        login2.setOnClickListener {
            val intent = Intent(this, mainmenu::class.java)
            startActivity(intent)
        }
    }
}