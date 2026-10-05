package com.android.techconnect.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.techconnect.screens.HomeScreen

@Composable
fun AppNavigator(
    modifier: Modifier = Modifier
) {

    val appNavigator = rememberNavController()

    NavHost(
        navController = appNavigator,
        startDestination = AppScreens.HOME.name
    ) {
        composable (
            route = AppScreens.HOME.name
        ) {
            HomeScreen()
        }
    }
}