package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpecialCharButton(
    char: String = "",
    onClick: () -> Unit = {}
) {
    Button(
        modifier = Modifier
            .width(35.dp)
            .height(35.dp),
        onClick = onClick,
        shape = RoundedCornerShape(45.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,

            )
    ) {
        Text(
            text = char,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
    }
}