package com.example.apkppbm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apkppbm.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("imageId",R.drawable.kucing1)

        binding.nameProfile.text = name
        binding.phoneProfile.text = phone
        binding.profileImage.setImageResource(imageId)
    }
}