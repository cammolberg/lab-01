package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Matcha", 32)

        val pets = mutableStateOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)
    }
}
