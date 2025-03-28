package com.example.marveleffectiveapp.ui.screens.superhero

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.navigation.NavController

@Composable
fun SuperheroScreen(name: String, imageUrl: String, slogan: String, navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = "Superhero",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        IconButton(
            onClick = { navController.popBackStack() }, // Возврат на предыдущий экран
            modifier = Modifier
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Назад",
                tint = Color.White
            )
        }
        Column(
            Modifier
                .align(alignment = Alignment.BottomStart)
                .offset(
                    x = 10.dp,
                    y = -50.dp
                )
        ){
            Text(
                text = name,
                color = Color.White,
                fontSize = 40.sp,
                fontWeight= FontWeight.ExtraBold,
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = slogan,
                color = Color.White,
                fontSize = 26.sp,
                fontWeight= FontWeight.SemiBold,
            )
        }
    }
}