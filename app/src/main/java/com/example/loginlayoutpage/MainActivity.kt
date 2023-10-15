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
                            navigateToSignIn = { navController.navigate("Log in") },
                            navigateToSignUp= { navController.navigate("Register") }
                        )
                    }
                    composable("Log in") {
                        LogInPage(
                            navigateToHome = { navController.navigate("HomePage")},
                            navigateToSignUp= { navController.navigate("Register") }
                        )
                    }
                    composable("Register") {
                        RegistrationPage(
                            navigateToHome = { navController.navigate("HomePage")},
                            navigateToSignIn = { navController.navigate("SignIn") }
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