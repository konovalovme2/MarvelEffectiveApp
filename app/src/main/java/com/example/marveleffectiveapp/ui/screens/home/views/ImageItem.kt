package com.example.marveleffectiveapp.ui.screens.home.views
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun ImageItem(name: String, imageUrl: String) {
    Box(
        modifier = Modifier
            .width(420.dp)
            .height(800.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(imageUrl),
            contentDescription = "Superhero",
            modifier = Modifier
                .width(350.dp)
                .height(667.dp)
                .align(alignment = Alignment.Center)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Text(
            text = name,
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .offset(
                    x = 60.dp,
                    y = -100.dp
                ),
            color = Color.White,
            fontSize = 40.sp,
            fontWeight= FontWeight.ExtraBold
        )
    }
}