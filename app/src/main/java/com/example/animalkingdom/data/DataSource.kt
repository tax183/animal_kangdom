package com.example.animalkingdom.data

import com.example.animalkingdom.R
import com.example.animalkingdom.model.Animal
// This code is written by Dina Abdulaziz Alnomi
class DataSource () {

    fun loadAnimals(): List<Animal> {
        return listOf<Animal> (

            Animal(R.string.tBear, R.drawable.image_bear, R.string.aboutBear),
            Animal(R.string.tElephant, R.drawable.image_elephant, R.string.aboutElephant),
            Animal(R.string.tBee, R.drawable.image_bee, R.string.aboutBee),
            Animal(R.string.tBird, R.drawable.image_bird, R.string.aboutBird),
            Animal(R.string.tCat, R.drawable.image_cat, R.string.aboutCat),
            Animal(R.string.tCow, R.drawable.image_cow, R.string.aboutCow),
            Animal(R.string.tFox, R.drawable.image_fox, R.string.aboutFox),
            Animal(R.string.tPenguin, R.drawable.image_penguin, R.string.aboutPenguin),
            Animal(R.string.tSheep, R.drawable.image_sheep, R.string.aboutSheep))
        }

    }
