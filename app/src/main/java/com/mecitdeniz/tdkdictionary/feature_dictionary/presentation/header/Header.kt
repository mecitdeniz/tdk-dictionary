package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.header

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mecitdeniz.tdkdictionary.R

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            modifier = Modifier.width(45.dp),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = null,
                tint = Color.White,
            )
        }

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 45.dp),
                textAlign = TextAlign.Center,
                text = stringResource(id = R.string.app_name),
                color = Color.White,
                style=MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )
    }
}