package com.example.ecoproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main1_1=findViewById<ImageButton>(R.id.main1_1)
        val main1_2=findViewById<ImageButton>(R.id.main1_2)
        val main1_3=findViewById<ImageButton>(R.id.main1_3)
        val main1_4=findViewById<ImageButton>(R.id.main1_4)
        val main1_5=findViewById<ImageButton>(R.id.main1_5)
        val main1_6=findViewById<ImageButton>(R.id.main1_6)
        val main1_7=findViewById<ImageButton>(R.id.main1_7)
        val main1_8=findViewById<ImageButton>(R.id.main1_8)
        val main1_9=findViewById<ImageButton>(R.id.main1_9)
        val main1_10=findViewById<ImageButton>(R.id.main1_10)
        val main1_11=findViewById<ImageButton>(R.id.main1_11)
        val main2_3=findViewById<ImageButton>(R.id.main2_3)
        val main2_2=findViewById<ImageButton>(R.id.main2_2)


        //메인화면에서 카테고리 이미지버튼 클릭했을 때 화면전환
        main1_1.setOnClickListener{
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        main1_2.setOnClickListener{
            val intent=Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        main1_3.setOnClickListener{
            val intent=Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
        main1_4.setOnClickListener{
            val intent=Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
        main1_5.setOnClickListener{
            val intent=Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        main1_6.setOnClickListener{
            val intent=Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
        main1_7.setOnClickListener{
            val intent=Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }
        main1_8.setOnClickListener{
            val intent=Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }
        main1_9.setOnClickListener{
            val intent=Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }
        main1_10.setOnClickListener{
            val intent=Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }
        main1_11.setOnClickListener{
            val intent=Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }

        main2_3.setOnClickListener{
            val intent=Intent(this, signin::class.java)
            startActivity(intent)
        }
        main2_2.setOnClickListener{
            val intent=Intent(this, map::class.java)
            startActivity(intent)
        }

    }
}