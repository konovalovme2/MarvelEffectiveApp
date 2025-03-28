package com.example.marveleffectiveapp.ui.screens.home.models

data class SuperHero(
    val name: String,
    val imageUrl: String,
    val slogan : String
)

data class HomeViewState(
    val images: List<SuperHero> = listOf(
        SuperHero("Deadpool", "https://iili.io/JMnAfIV.png", "Please don't make the super suit green...or animated!"),
        SuperHero("Iron Man", "https://iili.io/JMnuDI2.png", "I AM IRON MAN"),
        SuperHero("Spider-man", "https://iili.io/JMnuyB9.png", "in iron suit")
    )
)