package com.example.petshop

class Sad(date: String): Mood(date) {

    override fun emotion(): String {
        return "today is $date and your pet is sad :("
    }
}