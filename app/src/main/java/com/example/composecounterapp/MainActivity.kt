package com.example.composecounterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composecounterapp.ui.theme.ComposeCounterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCounterAppTheme {
                ComposeCounter()
            }
        }
    }
}

@Composable
fun ComposeCounter() {
    val primaryColor = Color(0xFF2196F3)
    var counter: Int by remember { mutableStateOf(0) }


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Compose Home Demo Page") },
                backgroundColor = primaryColor,
                contentColor = Color.White
            )
        },
        content = {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Text(
                    text = "You have pushed this button this many times",
                )
                Text(
                    text = counter.toString(),
                    style = MaterialTheme.typography.h4,
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    counter += 1
                },
                backgroundColor = primaryColor,
                contentColor = Color.White
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Add button")
            }
        },
    )
}

