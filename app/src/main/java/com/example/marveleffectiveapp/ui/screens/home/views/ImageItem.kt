package com.example.marveleffectiveapp.ui.screens.home.views
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.marveleffectiveapp.ui.screens.home.models.SuperHero

@Composable
fun ImageItem(image : SuperHero, navController: NavHostController) {
    Box(
        modifier = Modifier
            .width(420.dp)
            .height(800.dp)
            .clickable {navController.navigate(route = "Superhero/${Uri.encode(image.name)}/${Uri.encode(image.imageUrl)}/${Uri.encode(image.slogan)}")}
    ) {
        Image(
            painter = rememberAsyncImagePainter(image.imageUrl),
            contentDescription = "Superhero",
            modifier = Modifier
                .width(350.dp)
                .height(667.dp)
                .align(alignment = Alignment.Center)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Text(
            text = image.name,
            modifier = Modifier
                .align(alignment = Alignment.BottomStart)
                .offset(
                    x = 50.dp,
                    y = -100.dp
                ),
            color = Color.White,
            fontSize = 40.sp,
            fontWeight= FontWeight.ExtraBold
        )
    }
}