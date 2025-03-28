package com.example.marveleffectiveapp.ui.screens.home

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marveleffectiveapp.R
import com.example.marveleffectiveapp.ui.screens.home.models.HomeViewState
import com.example.marveleffectiveapp.ui.screens.home.views.ImageItem
import com.example.marveleffectiveapp.ui.theme.DarkRed


@Composable
fun HomeScreen() {
    val viewState = HomeViewState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray) // Серый фон
    ) {
        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            val width = size.width
            val height = size.height

            drawPath(
                path = Path().apply {
                    moveTo(width, height)
                    lineTo(width, height * 0.4f)
                    lineTo(width * 0.01f, height)
                    close()
                } as Path,
                color =  DarkRed
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.header_image),
                contentDescription = "header_image",
                modifier = Modifier.size(180.dp)
            )
            Text(
                text = "Choose your hero",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight= FontWeight.ExtraBold,
                modifier = Modifier.offset(y = -40.dp)
            )
            LazyRow (modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(viewState.images) {
                    image -> ImageItem(image.name, image.imageUrl)
                }
            }
        }
    }
}

