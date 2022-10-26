package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private var res: Float? = null;

    private var firstNumber: Float? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getResultFieldValue(): Float  {
        var input: TextInputEditText = findViewById(R.id.resultsET)

        return input.text.toString().toFloat();
    }

    fun clearInput() {
        var input: TextInputEditText = findViewById(R.id.resultsET)
        input.setText("");
    }

    fun clear(view: View) {
        this.res = null;
        clearInput()
    }

    fun add(view: View) {
        var secondNumber = getResultFieldValue();

        this.res = this.firstNumber!! + secondNumber;
        clearInput();
    }

    fun subtract(view: View) {
        var secondNumber = getResultFieldValue();

        this.res = this.firstNumber!! - secondNumber;
        clearInput();
    }

    fun multiply(view: View) {
        var secondNumber = getResultFieldValue();

        this.res = this.firstNumber!! * secondNumber;
        clearInput();
    }

    fun divide(view: View) {
        var secondNumber = getResultFieldValue();

        this.res = this.firstNumber!! / secondNumber;
        clearInput();
    }

    fun count(view: View) {
        println(this.res);

        clearInput();
    }

    fun and(view: View) {
        this.firstNumber = getResultFieldValue()

        clearInput();
    }
}