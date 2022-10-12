package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {

    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = state.content.toString())
    }

}