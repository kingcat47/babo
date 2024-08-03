package com.example.stu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.core.view.WindowCompat
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stu.ui.theme.StuTheme
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            StuTheme {
                Scaffold { padding ->
                    Move(modifier = Modifier.padding(padding))
                }
            }
        }
    }
}

//@Composable
//fun ScaffoldEx() {
//    Scaffold(topBar = {
//        TopAppBar(
//            title = { Text(text = "좀 실행되라") }
//    })
//}


@Composable
fun Logoimg(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .width(100.dp)
            .height(100.dp)
            .background(color = Color.Gray)

    )
}



@Composable
fun Login(modifier: Modifier = Modifier){
    Column() {
        Spacer(modifier = Modifier.height(16.dp))
        val userId = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
        TextField(

            value = userId.value,
            onValueChange = { userId.value = it },
            modifier = Modifier
                .height(50.dp)
                .width(200.dp)
           // placeholder = { Text(text = "User ID")}
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = password.value,
            onValueChange = {password.value = it},
            modifier = Modifier
                .height(50.dp)
                .width(200.dp)

        )

        Button(
            onClick = {},
            modifier = Modifier
                .height(50.dp)
                .width(200.dp)
                .padding(top = 16.dp)
        ) {
            Text(text = "완료")
        }
    }

}



@Composable
fun Move(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Logoimg(modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(85.dp))
        Login()
        Spacer(modifier = Modifier.height(100.dp))
    }
}



@Preview
@Composable
fun PreviewScreen() {
    StuTheme {
        Move()
        //ScaffoldEx()
    }
}
