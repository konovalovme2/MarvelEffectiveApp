package com.example.marveleffectiveapp.ui.screens.home.models

data class SuperHero(val name: String, val imageUrl: String)

data class HomeViewState(
    val images: List<SuperHero> = listOf(
        SuperHero("Deadpool", "https://iili.io/JMnAfIV.png"),
        SuperHero("Iron Man", "https://iili.io/JMnuDI2.png"),
        SuperHero("Spider-man", "https://iili.io/JMnuyB9.png")
    )
)