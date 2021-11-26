package com.example.practical

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val userChoice = intent.getStringExtra(EXTRA_MESSAGE)
    }


    fun sendMessageRock(view: View) {
        val editText = findViewById<Button>(R.id.rockbtn)
        val message = editText.text.toString()
        val intent = Intent(this, MainActivity3::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }


    fun sendMessagePaper(view: View) {
        val editText = findViewById<Button>(R.id.paperbtn)
        val message = editText.text.toString()
        val intent = Intent(this, MainActivity3::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendMessageScissors(view: View) {
        val editText = findViewById<Button>(R.id.scissorbtn)
        val message = editText.text.toString()
        val intent = Intent(this, MainActivity3::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}