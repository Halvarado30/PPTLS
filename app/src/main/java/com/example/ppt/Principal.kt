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


        // Se encarga de llamar al activity que contiene la modalidad de juego
        // presionando el botón de COMENZAR
        fun jugar() {
            val intent: Intent = Intent(this, Juego::class.java)
            startActivity(intent)
        }

        // Se encarga de llamar al activity que contiene las instrucciones para el juego
        // presionando el botón de INSTRUCCIONES
        fun instructions() {
            val intent = Intent(this, InstructionActivity::class.java)
            startActivity(intent)
        }

        botonJugar = findViewById(R.id.btninicio)
        botonSalir = findViewById(R.id.btnSalir)
        botonInstruccion = findViewById(R.id.btnInstruccion)

        botonJugar.setOnClickListener { jugar() }
        botonInstruccion.setOnClickListener{ instructions()}

        // Cumple la función de cerrar la aplicación en el caso de que se presione el botón SALIR
        botonSalir.setOnClickListener { finish() }
    }
}
