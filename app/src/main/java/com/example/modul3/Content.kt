package com.example.modul3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Content : AppCompatActivity() {

    private lateinit var logout : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_content)

        logout = findViewById(R.id.logout)

        logout.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}