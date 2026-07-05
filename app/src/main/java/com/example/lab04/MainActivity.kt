package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab04.ui.theme.Lab04Theme
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun EjemploCard() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Contenido de la tarjeta",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEjemploCard() {
    EjemploCard()
}

@Composable
fun EjemploSwitch() {
    var activado by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = if (activado) "Activado" else "Desactivado")
        Spacer(modifier = Modifier.width(8.dp))
        Switch(checked = activado, onCheckedChange = { activado = it })
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewEjemploSwitch() {
    EjemploSwitch()
}

@Composable
fun BotonPersonalizado() {
    Button(
        onClick = { /* Acción de ejemplo */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF6200EE),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Botón mejorado", fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBotonPersonalizado() {
    BotonPersonalizado()
}

