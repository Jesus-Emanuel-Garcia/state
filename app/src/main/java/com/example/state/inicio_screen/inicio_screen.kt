package com.example.state.inicio_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InicioScreen(modifier: Modifier){

    Column(modifier = modifier)
    {
        var y by remember {mutableStateOf("0") }
        var x by remember { mutableStateOf("0") }
        var z by remember { mutableStateOf(0) }

        TextField( value = y, onValueChange = {y=it})
        TextField( value = x, onValueChange = {x=it})

        Row(modifier = modifier) {
            Button(onClick = {z = y.toInt() + x.toInt()}) {
                Text("sumar", fontSize = 20.sp)
            }
        }
        Text(z.toString(), fontSize = 50.sp, textAlign = TextAlign.Center, modifier = Modifier.padding(100.dp))
    }



}


@Preview(showBackground = true)
@Composable
fun inicioPreview(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        InicioScreen(modifier = Modifier.padding(innerPadding))

    }

}