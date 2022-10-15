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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number1 = findViewById(R.id.etNumber1)
        number2 = findViewById(R.id.etNumber2)
        result = findViewById(R.id.tvResul)
    }

    fun calcular(view: View) {
        var op: Operation = Operation()
        var add: Int?
        var subs: Int?
        var mul: Int?
        var div: Float?
        add = op?.additionOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
        subs = op?.subtractionOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
        mul = op?.multiplicationOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
        div = op?.divisionOp(number1?.text.toString().toInt(), number2?.text.toString().toInt())
        result?.text = "Suma: $add \n Resta: $subs\n Multi: $mul\n Div: $div"
    }
}