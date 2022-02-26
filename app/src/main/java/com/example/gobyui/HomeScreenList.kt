package com.example.gobyui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gobyui.utilities.getItems
import com.example.gobyui.viewmodels.HomeScreenItem

@Composable
fun HomeScreenList() {
    val homeScreenItems = getItems()
    val listState = rememberLazyListState(Int.MAX_VALUE / 2)
    LazyRow(
        state = listState,
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(Int.MAX_VALUE, itemContent = {
            val index = it % homeScreenItems.size
            HomeScreenItem(model = homeScreenItems[index])
        })
    }
}