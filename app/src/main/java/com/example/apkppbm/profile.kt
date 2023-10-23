package com.example.apkppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val history1= findViewById<Button>(R.id.history)
        history1.setOnClickListener {
            val intent = Intent(this, history::class.java)
            startActivity(intent)
        }
        val promo1= findViewById<Button>(R.id.btn_promo)
        promo1.setOnClickListener {
            val intent = Intent(this, promo::class.java)
            startActivity(intent)
        }
        val about1= findViewById<Button>(R.id.btn_about)
        about1.setOnClickListener {
            val intent = Intent(this, about::class.java)
            startActivity(intent)
        }
    }
}