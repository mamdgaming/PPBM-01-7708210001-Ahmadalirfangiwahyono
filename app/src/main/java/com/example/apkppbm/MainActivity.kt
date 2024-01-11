package com.example.apkppbm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apkppbm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.kucing1,R.drawable.kucing2,R.drawable.kucing3,R.drawable.kucing4,R.drawable.kucing5,
            R.drawable.kucing6,R.drawable.kucing7,R.drawable.kucing8,R.drawable.kucing9,R.drawable.kucing10
        )

        val name = arrayOf(
            "Abdul",
            "Juki",
            "Nabil",
            "Rahmat",
            "Apud",
            "Joko",
            "Asep",
            "Budi",
            "Maryadi",
            "Sigit"
        )

        val lastMessage = arrayOf(
            "lohe","lohe","lohe","lohe","lohe",
            "lohe","lohe","lohe","lohe","lohe"
        )

        val lastmsgTime = arrayOf(
            "9:00 pm","5:00 pm","1:00 pm","7:00 pm","3:00 pm",
            "2:00 pm","8:00 pm","10:00 pm","4:00 pm","6:00 pm",
        )

        val phoneNo = arrayOf(
            "651841651","21348465","544874651","1659845","21548723",
            "231519456","519849862","18428396","74139654","3698325"
        )

        userArrayList = ArrayList()

        for(i in name.indices){
            val user = User(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i],imageId[i])
            userArrayList.add(user)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name [position]
            val phone = phoneNo [position]
            val imageId = imageId [position]

            val i = Intent (this,UserActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("phone", phone)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }
    }
}