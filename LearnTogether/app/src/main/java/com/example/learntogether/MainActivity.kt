package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learntogether.ui.theme.LearnTogetherTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage()
                }
            }
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box{
        Image(
            painter = image,
            contentDescription = null
        )
    }
}

@Composable
fun GreetingText(Text1: String,Text2: String,Text3: String,modifier: Modifier = Modifier){
    Text(
        text = Text1,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
    Text(
        text = Text2,
        fontSize = 14.sp,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text = Text3,
        fontSize = 14.sp,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}


@Preview(
    showBackground = true,
    name = "LearnTogether",
    showSystemUi = true
    )
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Column {
            GreetingImage()
            GreetingText(
                Text1 = "Historia de Kotlin",
                Text2 = "Kotlin se originó en JetBrains en 2010 y ha sido de código abierto desde 2012. Un sistema de programación relativamente joven pero que resulta fundamental para comprender la evolución de las aplicaciones diseñadas para Android. Un lenguaje que necesitas conocer si quieres ser programador de aplicaciones para dispositivos móviles.",
                Text3 = "Como te hemos contado en la introducción, se trata de un lenguaje de programación de código abierto, de tipo estático y multiplataforma. Kotlin apareció por primera vez en 2011, aunque no tuvo mucha popularidad en sus primeros cinco años de vida."
            )
        }
    }
}