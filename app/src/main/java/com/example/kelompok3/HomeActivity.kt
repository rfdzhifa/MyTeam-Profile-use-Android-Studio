package com.example.kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.hide()

        val finabutton: Button = findViewById(R.id.fina_button)
        finabutton.setOnClickListener { viewfina() }

        val aliyabutton: Button = findViewById(R.id.aliya_button)
        aliyabutton.setOnClickListener { viewaliya() }

        val sofiabutton: Button = findViewById(R.id.fia_button)
        sofiabutton.setOnClickListener { viewsofia() }

        val zhifabutton: Button = findViewById(R.id.zhifa_button)
        zhifabutton.setOnClickListener { viewzhifa() }
    }

    private fun viewfina() {
        val intent = Intent(this, Fina::class.java)
        startActivity(intent)
    }

    private fun viewaliya() {
        val intent = Intent(this, Aliya::class.java)
        startActivity(intent)
    }

    private fun viewsofia() {
        val intent = Intent(this, Sofia::class.java)
        startActivity(intent)
    }

    private fun viewzhifa() {
        val intent = Intent(this, Zhifa::class.java)
        startActivity(intent)
    }
}