package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Dice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
        val Back: Button = findViewById(R.id.dice_back)

        val rollButton: Button = findViewById(R.id.roll_btn)
        rollButton.setOnClickListener {

            rollDice()
        }
        Back.setOnClickListener {
            finish()
        }
    }
    private fun rollDice() {
        val randomNumber = (1..6).random()

        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        val diceImage: ImageView = findViewById(R.id.dice_img)
        diceImage.setImageResource(drawableResource)

    }


}
