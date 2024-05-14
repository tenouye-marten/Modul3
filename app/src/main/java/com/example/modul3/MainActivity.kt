package com.example.modul3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var log : Button

    private lateinit var reg : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        log = findViewById(R.id.LogIn)

        log.setOnClickListener {
            val intent = Intent (this, Content::class.java)
            startActivity(intent)

        }

        reg = findViewById(R.id.Register)

        reg.setOnClickListener {
            val intent = Intent (this, Registrasi::class.java)
            startActivity(intent)

        }

    }
}