package com.example.androiddemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button  = findViewById<Button>(R.id.tapOnMe)
        button.setOnClickListener{
            // Do something in response to button click
                Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()
        }


    }




}
