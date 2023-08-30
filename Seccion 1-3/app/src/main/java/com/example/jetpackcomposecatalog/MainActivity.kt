package com.example.jetpackcomposecatalog

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecatalog.ui.theme.JetPackComposeCatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeCatalogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyStateExample()
                }
            }
        }
    }
}


@Composable
fun MyStateExample(){

    var counter by rememberSaveable {mutableStateOf(0)}
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Button(onClick = { counter += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "He sido pulsado ${counter} veces. ")
    }
}


@Composable
fun MyComplexLayout(){
    Column(Modifier.fillMaxSize()){
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center){
            Text("Ejemplo 1")
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)){
            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Red), contentAlignment = Alignment.Center){
                Text("Ejemplo 2")
            }

            Box(
                Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Green), contentAlignment = Alignment.Center){
                Text("Ejemplo 3")
            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta), contentAlignment = Alignment.BottomCenter){
            Text("Ejemplo 4")
        }

    }
}


@Composable
fun MyRow(){
    Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center){
        Text("Ejemplo", modifier = Modifier.background(Color.Red))
        Text("Ejemplo", modifier = Modifier.background(Color.Black))
        Text("Ejemplo", modifier = Modifier.background(Color.Cyan))
        Text("Ejemplo", modifier = Modifier.background(Color.Blue))
    }

}


@Composable
fun MyColumn(){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center){
        Text("Ejemplo", modifier = Modifier.background(Color.Red))
        Text("Ejemplo", modifier = Modifier.background(Color.Black))
        Text("Ejemplo", modifier = Modifier.background(Color.Cyan))
        Text("Ejemplo", modifier = Modifier.background(Color.Blue))
    }

}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Box(modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .background(Color.Cyan))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeCatalogTheme {
        MyStateExample()
    }
}