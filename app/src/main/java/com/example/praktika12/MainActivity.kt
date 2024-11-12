package com.example.praktika12

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)

        val radioButon1 = findViewById<RadioButton>(R.id.radioButton1)
        val radioButon2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButon3 = findViewById<RadioButton>(R.id.radioButton3)

        val cB1 = findViewById<CheckBox>(R.id.checkBox1)
        val cB2 = findViewById<CheckBox>(R.id.checkBox2)
        val cB3 = findViewById<CheckBox>(R.id.checkBox3)

        fun radioButonClik(view: View) {
            when (view.id){
                R.id.radioButton1 -> imageView1.setImageResource(R.drawable.da2)
                R.id.radioButton2 -> imageView1.setImageResource(R.drawable.da3)
                R.id.radioButton3 -> imageView1.setImageResource(R.drawable.da7)
            }
        }
        radioButon1.setOnClickListener{
            radioButonClik(it)
        }
        radioButon2.setOnClickListener{
            radioButonClik(it)
        }
        radioButon3.setOnClickListener{
            radioButonClik(it)
        }
        cB1.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked) imageView2.setImageResource(R.drawable.da2)
            else imageView2.setImageDrawable(null)
        }
        cB2.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked) imageView3.setImageResource(R.drawable.da3)
            else imageView3.setImageDrawable(null)
        }
        cB3.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked) imageView4.setImageResource(R.drawable.da7)
            else imageView4.setImageDrawable(null)
        }
    }

}