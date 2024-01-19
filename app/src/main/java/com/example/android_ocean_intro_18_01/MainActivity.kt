package com.example.android_ocean_intro_18_01

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        val txtOne =  findViewById<TextView>(R.id.txt_one)
        val editTxt = findViewById<EditText>(R.id.edit_txt)
        val btnAbrirTela =  findViewById<Button>(R.id.btn_abrir_tela)

        btnEnviar.setOnClickListener {
            val input = editTxt.text

            if(input.isBlank()){
                editTxt.error = "Esse campo não pode estar vazio"
            }else {
                txtOne.text = editTxt.text
            }
        }

        btnAbrirTela.setOnClickListener {
            val abrirNovaTela = Intent(this, Result::class.java)
            startActivity(abrirNovaTela)

        }





    }
}