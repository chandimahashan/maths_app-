package com.example.cardviewtstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActivityPerimeter = findViewById<CardView>(R.id.perimeter)
        secondActivityPerimeter.setOnClickListener {
            val intent = Intent(this, Perimeter::class.java)
            startActivity(intent)
        }
    }
}