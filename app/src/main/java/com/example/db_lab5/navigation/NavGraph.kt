package com.example.db_lab5.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.db_lab5.ui.AdminHomeScreen
import com.example.db_lab5.ui.DataScreen
import com.example.db_lab5.ui.LoginScreen
import com.example.db_lab5.ui.UserHomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "login"){
        composable("login"){ LoginScreen(navController =navController) }
        composable("admin_home"){ AdminHomeScreen(navController = navController) }
        composable("user_home"){ UserHomeScreen(navController = navController) }
        composable("clients"){ DataScreen(title = "Clients", tableName = "Clients") }
        composable("goods"){ DataScreen(title = "Goods", tableName = "Goods") }
        composable("suppliers"){ DataScreen(title = "Suppliers", tableName = "Suppliers") }
        composable("goods-employees"){ DataScreen(title = "Goods-Employees", tableName = "GoodsEmployees") }
        composable("vendors"){ DataScreen(title = "Vendors", tableName = "Vendors") }
        composable("my_orders"){ DataScreen(title = "My Orders", tableName = "MyOrders") }
    }
}