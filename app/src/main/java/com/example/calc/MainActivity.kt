package com.example.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etnum1  = findViewById<TextInputEditText>(R.id.etnum1)
        val etnum2 = findViewById<TextInputEditText>(R.id.etnum2)

        val btnadd =findViewById<Button>(R.id.btnadd)
        val btnmul =findViewById<Button>(R.id.btnmul)
        val btnmin =findViewById<Button>(R.id.btnmin)
        val btndiv =findViewById<Button>(R.id.btndiv)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnadd.setOnClickListener {
            val etnum1 = etnum1.text.toString().toInt()
            val etnum2 = etnum2.text.toString().toInt()

            tvResult.text= (etnum1+etnum2).toString()

        }
        btnmul.setOnClickListener {
            val etnum2 = etnum2.text.toString().toInt()
            val etnum1 = etnum1.text.toString().toInt()


            tvResult.text= (etnum1*etnum2).toString()
        }
        btnmin.setOnClickListener {
            val etnum1 = etnum1.text.toString().toInt()
            val etnum2 = etnum2.text.toString().toInt()

            tvResult.text= (etnum1-etnum2).toString()
        }
        btndiv.setOnClickListener {
            val etnum1 = etnum1.text.toString().toInt()
            val etnum2 = etnum2.text.toString().toInt()

            tvResult.text= (etnum1/etnum2).toString()
        }


    }
}