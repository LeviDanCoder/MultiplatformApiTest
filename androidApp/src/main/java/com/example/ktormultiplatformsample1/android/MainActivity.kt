package com.example.ktormultiplatformsample1.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ktormultiplatformsample1.Greeting
import android.widget.TextView
import com.example.ktormultiplatformsample1.ApplicationApi

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()

        ApplicationApi().about {
            tv.text = it
        }
    }
}
