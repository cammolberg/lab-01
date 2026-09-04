package com.example.petshop

class Happy(name: String, age: Int, date: String): Pet(name, age), Mood(date) {

    override fun emotion() {
        println("$name is happy :)")
    }
}