package com.practicauno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number1: EditText? = null
    private var number2: EditText? = null
    private var result: TextView? = null
    private val op: Operation = Operation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        number1 = findViewById(R.id.etNumber1)
        number2 = findViewById(R.id.etNumber2)
        result = findViewById(R.id.tvResul)
    }

    fun calcular(view: View) {
        val add: Int?
        val subs: Int?
        val mul: Int?
        val div: Double?
        number1?.let{
            number2.let {
                add = op.additionOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
                subs = op.subtractionOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
                mul = op.multiplicationOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
                div = op.divisionOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
                result?.text = String.format(getString(R.string.calc_result),add,subs,mul,div)
            }
        }

    }
}