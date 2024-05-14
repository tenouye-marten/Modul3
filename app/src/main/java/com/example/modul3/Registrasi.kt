package com.example.modul3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registrasi : AppCompatActivity() {

    private lateinit var reg : Button

    private lateinit var log : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registrasi)

        reg = findViewById(R.id.Reg)

        reg.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)

        }

        log = findViewById(R.id.Login)

        log.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}