package com.example.android_ocean_intro_18_01

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Result : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnVoltar = findViewById<Button>(R.id.btn_voltar)

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}