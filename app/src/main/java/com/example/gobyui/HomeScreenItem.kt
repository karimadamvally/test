package com.example.gobyui.viewmodels

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gobyui.ui.theme.Shapes

@Composable
fun HomeScreenItem(model: HomeScreenViewModel) {
    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 20.dp),
        elevation = 2.dp,
        backgroundColor = model.mBackgroundColor,
        shape = Shapes.large,
    ) {
        Row {
            Icon(model.mIcon)
        }
    }
}

@Composable
private fun Icon(id: Int) {
    Image(
        painter = painterResource(id = id),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(20.dp)
            .size(100.dp)
    )
}