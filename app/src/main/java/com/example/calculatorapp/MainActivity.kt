package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etName = findViewById<EditText>(R.id.etName)
        val swLanguage = findViewById<Switch>(R.id.swLang)
        val tvResult = findViewById<TextView>(R.id.textView2)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)

        btnClickMe.setOnClickListener {

            val name = etName.text.toString()
            var greeting: String = ""

            if (swLanguage.isChecked) {
                if (name == "Fine shii") {
                    greeting = "Ekse $name, kunjani?"
                } else {
                    greeting = "Sawubona $name"
                }


            } else {
                greeting = "Good Morning $name"
            }
            tvResult.text = greeting

        }


    }
}