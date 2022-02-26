package com.example.gobyui.viewmodels

import androidx.compose.ui.graphics.Color

public class HomeScreenViewModel(id: Int, title: String, icon: Int, backgroundColor: Color) {
    val mId: Int = id
    val mTitle: String = title
    val mIcon: Int = icon
    val mBackgroundColor: Color = backgroundColor
}