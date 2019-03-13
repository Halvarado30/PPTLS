package com.example.ppt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_instruction.*

class InstructionActivity : AppCompatActivity() {

    var fondo = intArrayOf(R.drawable.piedrarules, R.drawable.papelrules, R.drawable.tijerasrules, R.drawable.lizardrules, R.drawable.spockrules)
    var next:Button?=null
    private var position:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction)
        iv_Instruccion.setImageResource(fondo[0])
        this.btnIntruccion.setOnClickListener{
            position += 1
            btnAnterior.visibility = View.VISIBLE
            iv_Instruccion.setImageResource(fondo[position])
            if (position == 4){
                btnIntruccion.visibility = View.INVISIBLE
            }
        }

        this.btnAnterior.setOnClickListener {
            position -= 1
            iv_Instruccion.setImageResource(fondo[position])
            if (position == 0){
                btnIntruccion.visibility = View.VISIBLE
                btnAnterior.visibility = View.INVISIBLE
            }
        }

        this.btnExit.setOnClickListener {
            finish()
        }
    }
}
