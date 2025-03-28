package com.example.marveleffectiveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marveleffectiveapp.ui.screens.home.HomeScreen
import com.example.marveleffectiveapp.ui.screens.superhero.SuperheroScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") {
            HomeScreen(navController)
        }
        composable("Superhero/{name}/{imageUrl}/{slogan}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            val imageUrl = backStackEntry.arguments?.getString("imageUrl")
            val slogan = backStackEntry.arguments?.getString("slogan")
            SuperheroScreen(name.toString(), imageUrl.toString(), slogan.toString(), navController)
        }

    }
}