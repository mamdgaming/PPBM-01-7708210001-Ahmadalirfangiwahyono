package com.example.apkppbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

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

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS85DBE8-qYdAuD1k6eWSO3NG3hBY1CXRO-4PK5IBuxT6qxUSEGlDkPBIitBRurVMU8_nY&usqp=CAU", "Kereta Listrik Terbaru Siap Beroperasi di Seluruh Negeri."))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPxAkB_N_GL9k8G0dP7Z2GCv359tjuMoC0iQ&usqp=CAU", "Pengembangan Jalur Wisata Kereta Api Menarik Minat Traveler."))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1IG3Bz-ViK9R39q4fuaUhFcweNOlKGy011A&usqp=CAU", "Fasilitas Baru dan Layanan Berkualitas Tinggi di Kereta Api."))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}