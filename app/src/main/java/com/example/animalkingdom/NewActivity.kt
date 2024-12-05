package com.example.animalkingdom

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.animalkingdom.model.Animal

class NewActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val animal = intent.getParcelableExtra<Animal>("animal")
        if(animal!= null) {
            val headerTV: TextView = findViewById(R.id.header_text)
            val mainImage: ImageView = findViewById(R.id.main_image)
            val subTV: TextView = findViewById(R.id.sub_text)

            headerTV.text = getString(animal.stringResourceId)
            mainImage.setImageResource(animal.imageResourceId)
            subTV.text = getString(animal.detailResourcedId)


            val button =findViewById<Button>(R.id.button4)
            button.setOnClickListener{
                finish()}


        }
    }
}