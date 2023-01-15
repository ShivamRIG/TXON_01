package com.example.unitconverter

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mbutton: Button
        val mET: EditText
        val mTV: TextView
        mbutton = findViewById<View>(R.id.button) as Button
        mET = findViewById<View>(R.id.editText) as EditText
        mTV = findViewById<View>(R.id.textView) as TextView
        mbutton.setOnClickListener {
            val convert = mET.text.toString().toDouble()
            mTV.text = (convert * 1000).toString() //Just put the formula here accordingly!!!
            mTV.setTextColor(Color.RED)
        }
    }
}