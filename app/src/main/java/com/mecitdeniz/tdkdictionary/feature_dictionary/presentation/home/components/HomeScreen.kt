package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content.toConfusion
import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content.toMistake
import com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.Red
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
        ) {

            Search(spacialChars = listOf("ç", "ğ", "ı", "ö", "ş", "ü", "a", "i", "ü"))
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 36.dp, topEnd = 36.dp))
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(top = 8.dp, start = 12.dp, end = 12.dp),
            ) {
                item {
                    state.content?.words?.forEach { word ->
                        ContentItem(
                            headerTitle = "Bir Kelime",
                            contentTitle = word.word,
                            contentDescription = word.meaning
                        )
                    }

                    state.content?.proverbs?.forEach { proverb ->
                        ContentItem(
                            headerTitle = "Bir Atasözü-Deyim",
                            contentTitle = proverb.proverb,
                            contentDescription = proverb.meaning
                        )
                    }

                    state.content?.rules?.forEach { rule ->
                        ContentItem(
                            headerTitle = "Bir Kural",
                            contentTitle = rule.name,
                            url = rule.url
                        )
                    }

                    state.content?.confusions?.let {
                        ContentItem(
                            headerTitle = "Sıkça Karıştırılan Kelimeler",
                            confusions = state.content.confusions.map {
                                it.toConfusion()
                            })
                    }
                    
                    state.content?.syyd?.let { mistakes ->
                        ContentItem(headerTitle = "Sıkça Yapılan Yanlışlara Doğrular", mistakes = mistakes.map { it.toMistake() } )
                    }

                }
            }
        }
    }
}