package com.example.androiddemo1


import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.TextView
import  android.view.View

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textLabel).apply {
            this.text = message
        }

    }

    fun didTapOnLoadAction(view : View){

            print("Tap to load image")
            this.showLoader()
    }

    private fun showLoader(){

        val loaderManager : ProgressDialog = ProgressDialog(this)
        loaderManager.setCanceledOnTouchOutside(true)
        loaderManager.closeOptionsMenu()
        loaderManager.show()

    }

}