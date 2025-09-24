package com.example.data_central.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.data_central.Model.DonativoViewModel

@Composable
fun AppNavHost(
    viewModel: DonativoViewModel,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = "Lista donativos"
    ){

        composable(route = "Lista donativos"){

        }
    }
}