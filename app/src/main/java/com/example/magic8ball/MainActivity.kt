package com.example.magic8ball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val askMeButton: Button = findViewById(R.id.button)
        askMeButton.setOnClickListener { shakeBall() }
    }

    private fun shakeBall() {
        val ballImageView: ImageView = findViewById(R.id.imageView)
        val randomChoice = Random().nextInt(20) + 1
        val imageResource = "R.drawable.magic_8_ball_$randomChoice"

    ballImageView.setImageResource(imageResource)
    }
}
