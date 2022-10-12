package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ContentHeader(
    title: String = ""
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .width(4.dp)
                    .height(4.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color.Black)
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(text = title, style = MaterialTheme.typography.h6)
        }
    }
}