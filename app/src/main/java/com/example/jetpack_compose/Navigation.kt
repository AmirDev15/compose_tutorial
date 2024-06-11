package com.example.jetpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable


fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {

        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }

        composable(route = Screen.DetailScreen.route + "/{name}",
            arguments = listOf(navArgument("name") {
                type = NavType.StringType
            }

            )) { backStackEntry ->
            // Extract the name argument from the back stack entry
            val name = backStackEntry.arguments?.getString("name")
            DetailScreen(name = name, navController = navController)
        }

    }
}

@Composable

fun MainScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        TextField(modifier = Modifier.fillMaxWidth(), value = text, onValueChange = {
            text = it
        }, label = { Text("Enter your name") }, // Optional label
            placeholder = { Text("Your name here") }

        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(modifier = Modifier.align(Alignment.End), onClick = {

            navController.navigate(Screen.DetailScreen.route + "/$text")
        }) {

            Text(text = "goto Detail Screen")


        }
    }

}


@Composable

fun DetailScreen(name: String?, navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {


        Text(
            modifier = Modifier.background(Color.Yellow), text = "hello $name"
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(modifier = Modifier, onClick = {
            navController.navigate(Screen.MainScreen.route) {
                //Pop up to the MainScreen and remove
                // DetailScreen from the back stack
                popUpTo(Screen.MainScreen.route) { inclusive = true }
            }

        }) {
            Text(text = "back to Main Screen")
        }

    }
}