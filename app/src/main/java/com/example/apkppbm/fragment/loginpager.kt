package com.example.apkppbm.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.apkppbm.R
import com.example.apkppbm.mainmenu
import com.example.apkppbm.register
import com.example.apkppbm.selamatdatang

class loginpager : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_loginpager, container, false)

        val buttonInFragment = view.findViewById<Button>(R.id.btn_login3)

        buttonInFragment.setOnClickListener {
            val _intent = Intent(requireContext(), selamatdatang::class.java)
            startActivity(_intent)
        }

        return view
    }
}