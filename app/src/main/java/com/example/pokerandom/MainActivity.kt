package com.example.pokerandom

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btn7 = findViewById<Button>(R.id.button7)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)
        val btn5 = findViewById<Button>(R.id.button5)
        val btn6 = findViewById<Button>(R.id.button6)
        val btn = findViewById<Button>(R.id.button)
        val btn8 = findViewById<Button>(R.id.button8)
        val btn9 = findViewById<Button>(R.id.button9)
        val btn14 = findViewById<Button>(R.id.button14)
        val imageView = findViewById<ImageView>(R.id.imageView)

        Glide
            .with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png")
            .into(imageView)

        //Faz um Random de todas as Gerações
        btn7.setOnClickListener {
            val number7 = (1..1025).random()
            getPhotoRandom(number = number7, image = imageView)
        }
        //Faz um Random da 1º Geração/Kanto
        btn.setOnClickListener {
            val number = (1 .. 151).random()
            getPhotoRandom(number = number, image = imageView)
        }
        //Faz um Random da 2º Geração/Johto
        btn8.setOnClickListener {
            val number8 = (152 .. 251).random()
            getPhotoRandom(number = number8, image = imageView)
        }
        //Faz um random da 3º Geração/Hoenn
        btn4.setOnClickListener {
            val number4 = (252 .. 386).random()
            getPhotoRandom(number = number4, image = imageView)
        }
        //Faz um random da 4º Geração/Sinnoh
        btn2.setOnClickListener {
            val number2 = (387 .. 493).random()
            getPhotoRandom(number = number2, image = imageView)
        }

        //Faz um random da 5º Geração/Unova
        btn9.setOnClickListener {
            val number9 = (494 .. 649).random()
            getPhotoRandom(number = number9, image = imageView)
        }

        //Faz um random da 6º Geração/Kalos
        btn5.setOnClickListener {
            val number5 = (650 .. 721).random()
            getPhotoRandom(number = number5, image = imageView)
        }

        //Faz um random da 7º Geração/Alola
        btn3.setOnClickListener {
            val number3 = (722 .. 809).random()
            getPhotoRandom(number = number3, image = imageView)
        }

        //Faz um random da 8º Geração/Galar
        btn14.setOnClickListener {
            val number14 = (810 .. 905).random()
            getPhotoRandom(number = number14, image = imageView)
        }

        //Faz um random da 9º Geração/Paldea
        btn6.setOnClickListener {
            val number6 = (906 .. 1025).random()
            getPhotoRandom(number = number6, image = imageView)
        }
    }

    private fun getPhotoRandom(number: Int, image: ImageView) {
        Glide
            .with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png")
            .into(image)

    }
}