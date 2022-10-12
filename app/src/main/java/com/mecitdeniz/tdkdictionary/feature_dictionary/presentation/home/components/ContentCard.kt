package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.mecitdeniz.tdkdictionary.core.util.extensions.Border
import com.mecitdeniz.tdkdictionary.core.util.extensions.border
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Confusion
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Mistake
import kotlinx.coroutines.delay


@JvmName("MistakesCard")
@Composable
fun ContentCard(
    mistakes: List<Mistake>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 8.dp,
    ){
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            mistakes.forEachIndexed{ index,mistake ->
                Row() {
                    Icon(
                        modifier=Modifier.padding(4.dp),
                        imageVector = Icons.Filled.Check,
                        contentDescription = null,
                        tint = Color.Green
                    )

                    Text(
                        modifier = Modifier.padding(vertical = 8.dp),
                        text = mistake.correctWord,
                        color = Color.Green,
                        style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.Bold
                    )
                }

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier=Modifier.padding(4.dp),
                        imageVector = Icons.Filled.Close,
                        contentDescription = null,
                        tint = Color.Green
                    )

                    Text(
                        modifier = Modifier.padding(vertical = 8.dp),
                        text = mistake.wrongWord,
                        color = Color.Red,
                        style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.Bold
                    )
                }
                if (index != mistakes.lastIndex) {
                    Divider(modifier = Modifier.padding(vertical = 8.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun ContentCard(
    confusions: List<Confusion>
) {
    val pageState = rememberPagerState()

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = 8.dp,
    ) {

        HorizontalPager(
            state = pageState,
            count = confusions.size
        ) { page ->

            Column(
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 8.dp),
                    text = confusions[page].correct,
                    color = Color.Black,
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold
                )
                Icon(
                    imageVector = Icons.Filled.Refresh,
                    contentDescription = null,
                    tint = Color.Green
                )
                Text(
                    modifier = Modifier.padding(vertical = 8.dp),
                    text = confusions[page].wrong,
                    color = Color.Gray,
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Bold

                )
            }
        }

        LaunchedEffect(pageState.currentPage) {
            // wait for 3 seconds.
            delay(3000)
            // increasing the position and check the size
            var newPosition = pageState.currentPage + 1
            if (newPosition > confusions.lastIndex) newPosition = 0
            // scrolling to the new position(starting from the beginning).
            pageState.animateScrollToPage(newPosition)
        }
    }

}

@Composable
fun ContentCard(
    title: String = "",
    description: String = "",
    showIcon: Boolean = false
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { },
        elevation = 10.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {


                Text(
                    text = title,
                    style = MaterialTheme.typography.body1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Medium
                )

                if (showIcon) {
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = null
                    )
                }
            }

            if (description.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            start = Border(strokeWidth = 3.dp, strokeColor = Color.LightGray)
                        )
                ) {
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = description,
                        style = MaterialTheme.typography.body2,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
    }
}