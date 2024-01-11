package com.example.apkppbm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.apkppbm.fragment.loginpager
import com.example.apkppbm.fragment.regpager
import com.google.android.material.tabs.TabLayout

class viewpager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewpager)

        var viewPager = findViewById(R.id.view_pager)as ViewPager
        var tablayout = findViewById(R.id.tablayout)as TabLayout

        val fragmentAdapter = FragmentAdapter (supportFragmentManager)
        fragmentAdapter.addFragment(loginpager(),"LOGIN")
        fragmentAdapter.addFragment(regpager(),"REGISTRASI")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)
    }
}