package com.example.apkppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class selamatdatang : AppCompatActivity() {
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selamatdatang)

        // Inisialisasi bottomSheetBehavior
        val bottomSheetView = findViewById<ConstraintLayout>(R.id.bottomSheet)
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetView)

        val login2 = findViewById<Button>(R.id.btn_masuk)
        login2.setOnClickListener {
            val intent = Intent(this, mainmenu::class.java)
            startActivity(intent)
        }

        val intip = findViewById<Button>(R.id.btn_intip)
        intip.setOnClickListener {
            showBottomSheet()
        }

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                // Tambahkan logika sesuai kebutuhan
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Tambahkan logika sesuai kebutuhan
            }
        })
    }

    private fun showBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }
}
