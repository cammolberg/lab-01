package com.example.petshop

class Happy(date: String): Mood(date) {

    override fun emotion(): String {
        return "Today is $date and your pet is happy :)"
    }
}