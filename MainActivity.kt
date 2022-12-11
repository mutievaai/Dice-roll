package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val cubeRoll = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(R.drawable.dice_4)

       when(cubeRoll){
           1 -> diceImage.setImageResource(R.drawable.dice_1)
           2 -> diceImage.setImageResource(R.drawable.dice_2)
           3 -> diceImage.setImageResource(R.drawable.dice_3)
           4 -> diceImage.setImageResource(R.drawable.dice_4)
           5 -> diceImage.setImageResource(R.drawable.dice_5)
           6 -> diceImage.setImageResource(R.drawable.dice_6)
       }
    }


}