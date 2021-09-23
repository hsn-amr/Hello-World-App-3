package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var mainText:TextView
    lateinit var inputText:EditText
    // here we tell that variable we initialize later
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainText = findViewById(R.id.tvMainText)
        inputText = findViewById(R.id.inputText)
        var btnChangeColor = findViewById<Button>(R.id.btnChangColor)
        var btnChangeText = findViewById<Button>(R.id.btnChangeText)

        btnChangeColor.setOnClickListener{changColor()}
        btnChangeText.setOnClickListener {changeText()}
    }

    fun changColor() {
        val colorList = listOf("#d35400", "#7f8c8d", "#e74c3c", "#f1c40f", "#34495e", "#1abc9c")
        val randomNumber = Random.nextInt(colorList.size)
        mainText.setTextColor(Color.parseColor("${colorList[randomNumber]}"))
    }
    fun changeText(){
        mainText.text = inputText.text
    }
}