package com.maximmesh.movies.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.maximmesh.movies.MainViewModel

@Composable
fun DetailsScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text(text = "Details Screen: item id: ${itemId}")
}