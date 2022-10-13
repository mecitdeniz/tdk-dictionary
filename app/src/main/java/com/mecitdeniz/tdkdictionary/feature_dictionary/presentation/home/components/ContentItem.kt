package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Confusion
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Mistake

@Composable
fun ContentItem(
    headerTitle: String,
    contentTitle: String,
    contentDescription: String? = "",
    url: String? = ""
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        ContentHeader(title = headerTitle)
        ContentCard(
            title = contentTitle,
            description = contentDescription ?: "",
            showIcon = !url.isNullOrEmpty()
        )
    }
}

@Composable
fun ContentItem(
    headerTitle: String,
    confusions: List<Confusion>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        ContentHeader(title = headerTitle)
        ContentCard(confusions)
    }
}

@JvmName("ContentItemMistakes")
@Composable
fun ContentItem(
    headerTitle: String,
    mistakes: List<Mistake>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        ContentHeader(title = headerTitle)
        ContentCard(mistakes)
    }
}