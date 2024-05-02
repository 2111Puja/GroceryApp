package com.puja.groceryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val groceries = arrayOf<String>(
        "Bread",
        "Milk",
        "Flour",
        "Eggs",
        "Sugar",
        "Chocolate",
        "Vanilla Essence")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the text view
        val groceryTextView = findViewById<TextView>(R.id.groceryTextView)

        //set the text view text to item in array
        groceryTextView.text = groceries[1];

    }
}