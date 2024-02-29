package com.example.cardviewtstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActivityPerimeterTriangle = findViewById<CardView>(R.id.charts)
        secondActivityPerimeterTriangle.setOnClickListener {
            val intent = Intent(this, perimeter_Triangle::class.java)
            startActivity(intent)
        }

        val secondActivityNote = findViewById<CardView>(R.id.note)
        secondActivityNote.setOnClickListener {
            val intent = Intent(this, note::class.java)
            startActivity(intent)
        }
    }
}