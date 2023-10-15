package com.example.loginlayoutpage.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginlayoutpage.R
import com.example.loginlayoutpage.ui.theme.BlueMain
import com.example.loginlayoutpage.ui.theme.LoginLayoutPageTheme
import com.example.loginlayoutpage.ui.theme.MainBackgroundColor
import com.example.loginlayoutpage.ui.theme.YellowMain

@Composable
fun WelcomePage(
    modifier: Modifier = Modifier,
    navigateToLogIn : () -> Unit,
    navigateToRegister : () -> Unit
){
    Surface(modifier = modifier.fillMaxSize(),
        color = MainBackgroundColor
    ){
        Column(modifier = Modifier
            .padding(15.dp)
        ) {
            Spacer(Modifier.height(25.dp))
            Image(
                painter = painterResource(id = R.drawable.mountain_logo_design),
                contentDescription = stringResource(id = R.string.logo),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp),
                Alignment.Center
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                Arrangement.Center
            ) {
                Button(
                    onClick = {navigateToRegister},
                    modifier = Modifier
                        .padding(bottom = 20.dp, end = 40.dp, start = 40.dp)
                        .width(300.dp),
                    colors = buttonColors(containerColor = BlueMain),
                    border = BorderStroke(3.dp, YellowMain),
                )
                {
                    Text(text = stringResource(R.string.register), fontSize = 30.sp)
                }

                Button(
                    onClick = { navigateToLogIn},
                    modifier = Modifier
                        .padding(top = 20.dp, end = 40.dp, start = 40.dp)
                        .width(300.dp),
                    colors = buttonColors(containerColor = BlueMain),
                    border = BorderStroke(3.dp, YellowMain),
                )
                {
                    Text(text = stringResource(R.string.log_in), fontSize = 30.sp)
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun WelcomePageAppPreview() {
//    LoginLayoutPageTheme {
//        WelcomePage()
//    }
//}