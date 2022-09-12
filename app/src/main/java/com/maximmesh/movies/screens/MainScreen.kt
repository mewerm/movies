package com.maximmesh.movies.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Hi here is Main Activity Bro. Просто потому, что  all is work good =)")
    }

}