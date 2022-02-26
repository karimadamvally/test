package com.example.gobyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.gobyui.ui.theme.GobyUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GobyUITheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Scaffold(content = {
        HomeScreenList()
    })
}