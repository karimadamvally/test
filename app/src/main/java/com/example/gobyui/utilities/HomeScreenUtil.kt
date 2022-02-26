package com.example.gobyui.utilities

import com.example.gobyui.R
import com.example.gobyui.viewmodels.HomeScreenViewModel
import com.example.gobyui.ui.theme.Blue
import com.example.gobyui.ui.theme.Red
import com.example.gobyui.ui.theme.Yellow

fun getItems(): List<HomeScreenViewModel> {
    return listOf(
        HomeScreenViewModel(1, Titles.NOTIFICATIONS, R.drawable.ic_notification, Red),
        HomeScreenViewModel(2, Titles.CALLS, R.drawable.ic_call_status, Blue),
        HomeScreenViewModel(3, Titles.LOCATION, R.drawable.ic_location, Yellow),
        HomeScreenViewModel(4, Titles.SETTINGS, R.drawable.ic_setting, Red)
    )
}