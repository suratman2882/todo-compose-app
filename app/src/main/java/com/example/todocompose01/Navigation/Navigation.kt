package com.example.todocompose01.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todocompose01.ui.ui.theme.DetailScreen
import com.example.todocompose01.ui.ui.theme.HomeScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("detail/{task}") { backStackEntry ->
            val task = backStackEntry.arguments?.getString("task") ?: ""
            DetailScreen(navController, task)
        }
    }
}
