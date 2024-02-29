package com.example.cardviewtstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class note : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val notePerimeterView = findViewById<CardView>(R.id.perimeter)
        notePerimeterView.setOnClickListener {
            val intent = Intent(this,note_perimeter::class.java)
            startActivity(intent)
        }

        val noteArea = findViewById<CardView>(R.id.area)
        noteArea.setOnClickListener {
            val intent =Intent(this,note_Area::class.java)
            startActivity(intent)
        }

        val noteVolume = findViewById<CardView>(R.id.volume)
        noteVolume.setOnClickListener {
            val intent = Intent(this,note_volume::class.java)
            startActivity(intent)
        }
    }
}