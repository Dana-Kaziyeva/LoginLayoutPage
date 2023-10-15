package com.example.loginlayoutpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.loginlayoutpage.pages.HomePage
import com.example.loginlayoutpage.pages.LogInPage
import com.example.loginlayoutpage.pages.RegistrationPage
import com.example.loginlayoutpage.pages.WelcomePage
import com.example.loginlayoutpage.ui.theme.LoginLayoutPageTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginLayoutPageTheme {
                val navController = rememberNavController()
                NavHost(navController =  navController, startDestination = "WelcomePage") {
                    composable("WelcomePage") {
                        WelcomePage(
                            navigateToLogIn = { navController.navigate("LogIn") },
                            navigateToRegister= { navController.navigate("Register") }
                        )
                    }
                    composable("LogIn") {
                        LogInPage(
                            navigateToHomePage = { navController.navigate("HomePage")},
                            navigateToRegister= { navController.navigate("Register") }
                        )
                    }
                    composable("Register") {
                        RegistrationPage(
                            navigateToHomePage = { navController.navigate("HomePage")},
                            navigateToLogIn = { navController.navigate("LogIn") }
                        )
                    }
                    composable("HomePage") {
                        HomePage(navigateBack = { navController.popBackStack("WelcomePage", inclusive = false)})
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    LoginLayoutPageTheme {
//        Greeting("Android")
//    }
//}