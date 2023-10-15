package com.example.loginlayoutpage.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginlayoutpage.R
import com.example.loginlayoutpage.ui.theme.LoginLayoutPageTheme

@Composable
fun WelcomePage(
    modifier: Modifier = Modifier
){
    Surface(modifier = modifier.fillMaxSize(),
        color = Color(238, 200, 164, 255)
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
                    onClick = {},
                    modifier = Modifier
                        .padding(bottom = 20.dp, end = 40.dp, start = 40.dp)
                        .width(300.dp),
                    colors = buttonColors(containerColor = Color(0,113,188)),
                    border = BorderStroke(3.dp, Color(247,178,59)),
                )
                {
                    Text(text = stringResource(R.string.register), fontSize = 30.sp)
                }

                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(top = 20.dp, end = 40.dp, start = 40.dp)
                        .width(300.dp),
                    colors = buttonColors(containerColor = Color(0,113,188)),
                    border = BorderStroke(3.dp, Color(247,178,59)),
                )
                {
                    Text(text = stringResource(R.string.log_in), fontSize = 30.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePageAppPreview() {
    LoginLayoutPageTheme {
        WelcomePage()
    }
}