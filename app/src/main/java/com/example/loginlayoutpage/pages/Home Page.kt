package com.example.loginlayoutpage.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginlayoutpage.ui.theme.BlueMain
import com.example.loginlayoutpage.ui.theme.LoginLayoutPageTheme
import com.example.loginlayoutpage.ui.theme.MainBackgroundColor

@Composable
fun HomePage(
    navigateBack: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MainBackgroundColor)
            .padding(50.dp),
    ) {
        Text(
            text = "Hello world! It's home page!",
            color = BlueMain,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            "Exit",
            fontSize = 18.sp,
            modifier = Modifier.padding(10.dp).clickable(onClick = navigateBack)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun HomePageAppPreview() {
//    LoginLayoutPageTheme {
//        HomePage()
//    }
//}
