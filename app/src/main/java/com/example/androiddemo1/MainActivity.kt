package com.example.androiddemo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

const val EXTRA_MESSAGE = "com.example.androiddemo1.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button  = findViewById<Button>(R.id.launchButton)
        button.setOnClickListener{
            // Do something in response to button click
            //Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()

            val listIntent = Intent(this, ListActivity::class.java).apply {
                    putExtra(EXTRA_MESSAGE, "Open List")
            }

            startActivity(listIntent)
        }

    }




}
