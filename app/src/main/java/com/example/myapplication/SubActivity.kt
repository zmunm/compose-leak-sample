package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

class SubActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val image = "https://d1ntratmora82n.cloudfront.net/t_NEW_GOODS_THUMB_WEBP/https://imgb.a-bly.com/data/goods/20220516_1652664062821753s.gif"

        setContent {
            LazyColumn {
                items(300) {
                    AsyncImage(
                        model = image,
                        modifier = Modifier.size(100.dp, 120.dp),
                        contentDescription = null,
                    )
                }
            }
        }
    }
}
