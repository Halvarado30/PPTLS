package com.example.ppt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var botonJugar: Button
        var botonSalir: Button
        var botonInstruccion:Button

        fun jugar() {
            val intent: Intent = Intent(this, Juego::class.java)
            startActivity(intent)
        }

        fun instructions() {
            val intent: Intent = Intent(this, InstructionActivity::class.java)
            startActivity(intent)
        }

        botonJugar = findViewById(R.id.btninicio)
        botonSalir = findViewById(R.id.btnSalir)
        botonInstruccion = findViewById(R.id.btnInstruccion)

        botonJugar.setOnClickListener { jugar() }
        botonInstruccion.setOnClickListener{ instructions()}
        botonSalir.setOnClickListener { finish() }
    }
}
