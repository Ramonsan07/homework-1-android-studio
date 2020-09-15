package com.example.please

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView2)
    }

    fun buttonActivity(view: View){
        //val textViewTex = textView.text.toString()
        //val button = view as Button
        //val buttonText = button.text.toString()
        //textView.text = buttonText
        //Log.d("MainActivity", textViewTex)
        textView.text = "hello world!"
    }

}