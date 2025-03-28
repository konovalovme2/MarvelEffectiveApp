package com.example.marveleffectiveapp.ui.screens.home.models

sealed class HomeEvent{
    object scrollLeft : HomeEvent()
    object scrollRight : HomeEvent()
    data class SuperheroClick(val Url: String) : HomeEvent()
}