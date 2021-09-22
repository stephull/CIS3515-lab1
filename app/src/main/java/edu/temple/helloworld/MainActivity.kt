package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val PressedButtonText : TextView = findViewById(R.id.dummytext)
        findViewById<Button>(R.id.button).setOnClickListener {
            PressedButtonText.setText("You clicked the button!")
        }
    }
}