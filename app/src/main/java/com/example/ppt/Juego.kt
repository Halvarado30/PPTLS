package com.example.ppt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_juego.*

@Suppress("DEPRECATED_IDENTITY_EQUALS")
class Juego : AppCompatActivity(), View.OnClickListener {
    var input: ImageView? = null
    var output: ImageView? = null
    var rock: Button? = null
    var paper: Button? = null
    var scissors: Button? = null
    var lizard: Button? = null
    var spock: Button? = null

    var images = intArrayOf(R.drawable.piedra, R.drawable.papel, R.drawable.tijera, R.drawable.lagartija, R.drawable.spock)
    var userinput = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)
        input = findViewById(R.id.iv_input)
        output = findViewById(R.id.iv_output)
        rock = findViewById(R.id.btn_piedra)
        paper = findViewById(R.id.btn_papel)
        scissors = findViewById(R.id.btn_tijera)
        lizard = findViewById(R.id.btn_lagartija)
        spock = findViewById(R.id.btn_spock)

        rock?.setOnClickListener(this)
        paper?.setOnClickListener(this)
        scissors?.setOnClickListener(this)
        lizard?.setOnClickListener(this)
        spock?.setOnClickListener(this)

        btnExit.setOnClickListener {
            finish()
        }
    }

    override fun onClick(v: View) {
        val id = v.id
        when (id) {
            R.id.btn_piedra -> {
                userinput = 1
                input?.setBackgroundResource(R.drawable.piedra)
                setOutput()
            }
            R.id.btn_papel -> {
                userinput = 2
                input?.setBackgroundResource(R.drawable.papel)
                setOutput()
            }
            R.id.btn_tijera -> {
                userinput = 3
                input?.setBackgroundResource(R.drawable.tijera)
                setOutput()
            }
            R.id.btn_lagartija -> {
                userinput = 4
                input?.setBackgroundResource(R.drawable.lagartija)
                setOutput()
            }
            R.id.btn_spock -> {
                userinput = 5
                input?.setBackgroundResource(R.drawable.spock)
                setOutput()
            }
        }
    }

    private fun setOutput() {
        val imageId = (Math.random() * images.size ).toInt()
        output?.setBackgroundResource(images[imageId])
        checkResult(imageId)
    }

    private fun checkResult(imageId: Int) {
        if (userinput === 1 && imageId == 0) { // Jugadas Piedra
            showResult(2)
        } else if (userinput === 1 && imageId == 1) {
            showResult(0)
        } else if (userinput === 1 && imageId == 2) {
            showResult(1)
        } else if (userinput == 1 && imageId == 3){
            showResult(1)
        } else if (userinput == 1 && imageId == 4){
            showResult(0)
        } else if (userinput === 2 && imageId == 0) {  // Jugadas-Papel
            showResult(1)
        } else if (userinput === 2 && imageId == 1) {
            showResult(2)
        } else if (userinput === 2 && imageId == 2) {
            showResult(0)
        } else if (userinput === 2 && imageId == 3) {
            showResult(0)
        } else if (userinput === 2 && imageId == 4) {
            showResult(1)
        } else if (userinput === 3 && imageId == 0) { // Jugadas-Tijeras
            showResult(0)
        } else if (userinput === 3 && imageId == 1) {
            showResult(1)
        } else if (userinput === 3 && imageId == 2) {
            showResult(2)
        } else if (userinput === 3 && imageId == 3) {
            showResult(1)
        } else if (userinput === 3 && imageId == 4) {
            showResult(0)
        } else if (userinput === 4 && imageId == 0) { // Jugadas-Lagartija
            showResult(0)
        } else if (userinput === 4 && imageId == 1) {
            showResult(1)
        } else if (userinput === 4 && imageId == 2) {
            showResult(0)
        } else if (userinput === 4 && imageId == 3) {
            showResult(2)
        } else if (userinput === 4 && imageId == 4) {
            showResult(1)
        } else if (userinput === 5 && imageId == 0) { // Jugadas-spock
            showResult(1)
        } else if (userinput === 5 && imageId == 1) {
            showResult(0)
        } else if (userinput === 5 && imageId == 2) {
            showResult(1)
        } else if (userinput === 5 && imageId == 3) {
            showResult(0)
        } else if (userinput === 5 && imageId == 4) {
            showResult(2)
        }
    }

    private fun showResult(result: Int) {
        when(result){
            0->Toast.makeText(applicationContext, "PIERDE", Toast.LENGTH_SHORT).show()
            1-> Toast.makeText(applicationContext, "GANA", Toast.LENGTH_SHORT).show()
            else->Toast.makeText(applicationContext, "EMPATE", Toast.LENGTH_SHORT).show()
        }
    }
}

