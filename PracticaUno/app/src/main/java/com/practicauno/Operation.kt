package com.practicauno

import android.view.View

class Operation() {
    fun additionOp(numberOne: Int, numberTwo: Int): Int = numberOne + numberTwo
    fun subtractionOp(numberOne: Int, numberTwo: Int): Int = numberOne - numberTwo
    fun multiplicationOp(numberOne: Int, numberTwo: Int): Int = numberOne * numberTwo
    fun divisionOp(numberOne: Int, numberTwo: Int): Double = numberOne.toDouble() / numberTwo.toDouble()
}