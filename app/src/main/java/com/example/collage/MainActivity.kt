package com.example.collage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.collage.ui.theme.CollageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CollageTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    ImageGrid()
                }
            }
        }
    }
}

@Composable
fun ImageGrid() {
    val imageList = listOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img7,
        R.drawable.img6,
        R.drawable.img8,
        R.drawable.img9

    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),

    ) {
        items(imageList.size) { index ->
            MyImage(imageRes = imageList[index])
        }
    }
}

@Composable
fun MyImage(imageRes: Int) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Image",
        modifier = Modifier
            .padding(0.dp)
            .aspectRatio(1f)

    )
}

@Preview(showBackground = true, widthDp = 490, heightDp = 800)
@Composable
fun DefaultPreview() {
    CollageTheme {
        ImageGrid()
    }
}

