package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var dog : RadioButton
    lateinit var kukur : RadioButton
    lateinit var bird : RadioButton
    lateinit var image: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        dog=findViewById(R.id.radioDog)
        bird=findViewById(R.id.radioBird)
        kukur=findViewById(R.id.radioKukur)
        image=findViewById(R.id.imageView3)

        dog.setOnClickListener{
            image.setImageResource(R.drawable.dog)
        }
        kukur.setOnClickListener{
            image.setImageResource(R.drawable.kukur)
        }
        bird.setOnClickListener{
            image.setImageResource(R.drawable.bird)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}