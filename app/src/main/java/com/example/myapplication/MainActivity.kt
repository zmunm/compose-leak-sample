package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import coil.compose.AsyncImage
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    var state by mutableStateOf(0L)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val image = "https://d1ntratmora82n.cloudfront.net/t_NEW_GOODS_THUMB_WEBP/https://imgb.a-bly.com/data/goods/20220516_1652664062821753s.gif"

        setContent {
            AsyncImage(
                model = image,
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        startActivity(Intent(this, SubActivity::class.java))
                    },
                contentDescription = null,
            )

            Text(text = state.toString())
        }

        lifecycleScope.launch {
            while (true) {
                delay(1000)
                state = System.currentTimeMillis()
            }
        }
    }
}
