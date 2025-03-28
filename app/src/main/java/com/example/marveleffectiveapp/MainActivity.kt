package com.example.marveleffectiveapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.marveleffectiveapp.ui.screens.home.HomeScreen


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
    MaterialTheme {
        AppNavigation(navController)
    }
}

@Composable
fun AppNavigation(navController: NavHostController) {
    HomeScreen()
}

@Preview()
@Composable
fun SimpleComposablePreview() {
    App()
}