package com.mecitdeniz.tdkdictionary

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home_screen")
}
