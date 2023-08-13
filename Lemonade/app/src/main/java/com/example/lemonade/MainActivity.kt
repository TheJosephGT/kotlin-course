package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                LemonadeApp()
            }
        }
    }
}

@Preview(showBackground = true, name = "Lemonade", showSystemUi = true)
@Composable
fun LemonadeApp() {
    Acciones()
}

@Composable
fun Acciones(modifier: Modifier = Modifier){
    var result by remember { mutableStateOf(1) }
    var Texto = ""
    val imageResource = when (result){
        1 -> {
            Texto = "Tap the lemon tree to select a lemon"
            R.drawable.lemon_tree_1
        }
        2 -> {
            Texto = "Keep tapping the lemon to squeeze it"
            R.drawable.lemon_squeeze_2
        }
        3 -> {
            Texto = "Tap the lemonade to drink it"
            R.drawable.lemon_drink_3
        }
        4 -> {
            Texto = "Tap the empty glass to start again"
            R.drawable.lemon_restart_4
        }
        else -> {
            Texto = "Tap the lemon tree to select a lemon"
            R.drawable.lemon_tree_1
        }
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = imageResource), contentDescription = Texto)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            result = if (result < 4) {
                result + 1
            } else {
                1
            }
        }) {
            Text(text = "Click")
        }
    }

}