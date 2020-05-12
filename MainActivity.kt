package com.example.helloworldstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.math.abs
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bmicheck(view: View)
    {
        var height = findViewById<EditText>(R.id.getheight)
        var weight = findViewById<EditText>(R.id.getweight)
        var weight1 = weight.text.toString().toFloat()
        var height1 = height.text.toString().toFloat()
        var height2 = height1 * height1
        height2 = height2 / 10000
        var bmi = (weight1 / height2).toFloat()
        var print1 = "Your Bmi Is " + bmi.toString()
        var weight_need = 21.7 * height2
        var weight_diff = weight_need - weight1
        var cal_need = abs(weight_diff) * 7000

        if( weight_diff < 0)
        {
            var print2 = "You Need To Reduce " + abs(weight_diff).roundToInt().toString() + " Kgs"
            val print_screen2 = findViewById<TextView>(R.id.insertit2).apply {
                text = print2
            }
        }
        else
        {
            var print2 = "You Need To Gain " + abs(weight_diff).roundToInt().toString() + " Kgs"
            val print_screen2 = findViewById<TextView>(R.id.insertit2).apply {
                text = print2
            }
        }

        if( weight_diff < 0)
        {
            var print3 = "You Need To Burn " + cal_need.roundToInt().toString() + " calories"
            val print_screen2 = findViewById<TextView>(R.id.insertit3).apply {
                text = print3
            }
        }
        else
        {
            var print3 = "You Need To Gain " + cal_need.roundToInt().toString() + " calories"
            val print_screen2 = findViewById<TextView>(R.id.insertit3).apply {
                text = print3
            }
        }


        val print_screen1 = findViewById<TextView>(R.id.insertit).apply {
            text = print1
        }
    }

}
