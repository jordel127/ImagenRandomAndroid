package com.jordel127.imagenrandom

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imagenDado: ImageView = findViewById(R.id.imageViewDado)
        val bottonRoll: Button = findViewById(R.id.buttonRoll)


        bottonRoll.setOnClickListener{
            val numDado = Random.nextInt(0,7)
            when (numDado) {
                1 -> imagenDado.setImageResource(R.drawable.dice_1)
                2 -> imagenDado.setImageResource(R.drawable.dice_2)
                3 -> imagenDado.setImageResource(R.drawable.dice_3)
                4 -> imagenDado.setImageResource(R.drawable.dice_4)
                5 -> imagenDado.setImageResource(R.drawable.dice_5)
                else -> imagenDado.setImageResource(R.drawable.dice_6)
            }
        }
    }
}