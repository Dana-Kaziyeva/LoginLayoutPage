package com.example.loginlayoutpage.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginlayoutpage.R
import com.example.loginlayoutpage.ui.theme.BlueMain
import com.example.loginlayoutpage.ui.theme.LoginLayoutPageTheme
import com.example.loginlayoutpage.ui.theme.MainBackgroundColor
import com.example.loginlayoutpage.ui.theme.YellowMinor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogInPage(
    modifier: Modifier = Modifier,
    navigateToHomePage: () -> Unit,
    navigateToRegister: () -> Unit
){
    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current
    val passwordVisibility by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MainBackgroundColor)
            .padding(30.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = stringResource(R.string.log_in),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = BlueMain
        )
        Spacer(Modifier.height(26.dp))

        OutlinedTextField(
            value = "User name",
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(254,208,73)
            ),
            onValueChange = { userName = it },
            label = { R.string.user_name },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
                ),
            keyboardActions = KeyboardActions(
                onNext = { focusManager.moveFocus(FocusDirection.Down) }
            ),
        )
        OutlinedTextField(
            value = "Password",
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(254,208,73)
            ),
            onValueChange = { password = it },
            label = { R.string.password },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = { focusManager.clearFocus() }
            ),
        )

        Button(
            onClick = { navigateToHomePage() },
            modifier= Modifier
                .align(Alignment.End)
                .border(
                    width = 4.dp,
                    shape = RoundedCornerShape(18.dp),
                    color = Color.Unspecified
                )
                .padding(end = 15.dp)
            ,
            colors = ButtonDefaults.buttonColors(containerColor = BlueMain)
        )
        {
            Text(
                text = "Get started",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .clickable(
                        onClick = { navigateToHomePage() }
                    ),
            )
        }
        Spacer(modifier = modifier.height(10.dp))
        Row {
            Text(
                text = "Not registered?  ",
                color = YellowMinor,
                fontSize = 18.sp
            )
            Text(
                text = "Sign up",
                fontSize = 18.sp,
                modifier = Modifier
                    .clickable(
                        onClick = { navigateToRegister }
                    ),
                color = BlueMain
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun LogInPageAppPreview() {
//    LoginLayoutPageTheme {
//        LogInPage()
//    }
//}



