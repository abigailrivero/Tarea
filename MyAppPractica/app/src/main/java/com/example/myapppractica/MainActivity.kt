package com.example.myapppractica

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnSiguiente = findViewById<ImageButton>(R.id.imageButton)
        btnSiguiente.setOnClickListener {
            val sig = Intent(this, MainActivity2::class.java)
            startActivity(sig)
        }
    }
}