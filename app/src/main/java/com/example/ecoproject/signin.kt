package com.example.ecoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class signin : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)

        val SignUp = findViewById<TextView>(R.id.SignUp)

        SignUp.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}