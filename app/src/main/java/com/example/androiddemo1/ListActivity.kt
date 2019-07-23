package com.example.androiddemo1


import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import  android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class ListActivity : AppCompatActivity() {

    private  var loaderManager : ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.textLabel).apply {
            this.text = message
        }

        this.createProgress()
    }
    /*
    * Create Progress
    * */
    private fun createProgress() {
        loaderManager = ProgressBar(this)
        loaderManager?.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        val linearLayout = findViewById<LinearLayout>(R.id.ListRoot_Acitivity)
        linearLayout.addView(loaderManager)
        loaderManager?.visibility = View.GONE
    }

    fun didTapOnLoadAction(view : View){

        val isVisible = when {

            loaderManager?.visibility == View.GONE -> { View.VISIBLE }
            else -> { View.GONE }

        }

        loaderManager?.visibility = isVisible

        var loaderButton = findViewById<Button>(R.id.loadButton)
        val buttonText = when {

            (isVisible == View.VISIBLE) -> { "Hide Loader" }
            else -> { "Show Loader" }

        }

        loaderButton.text = buttonText

    }

}