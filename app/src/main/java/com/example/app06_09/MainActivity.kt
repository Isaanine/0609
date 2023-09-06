package com.example.app06_09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.app06_09.ui.theme.App0609Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App0609Theme {
                    SimpleCenterAlignedTopAppBar()
                    Screen()

                }
            }
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen() {
    Column {
        SimpleCenterAlignedTopAppBar()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {

                var name by rememberSaveable { mutableStateOf("") }
                var tel by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Nome") },
                    placeholder = { Text("João Pereira Diniz") }
                )
                TextField(
                    value = tel,
                    onValueChange = { tel = it },
                    label = { Text("Telefone") },
                    placeholder = { Text("(00)00000-0000") }
                )


            }
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleCenterAlignedTopAppBar() {
        TopAppBar(
            windowInsets = TopAppBarDefaults.windowInsets,
            title = { Text("Songs") },
            colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = Color(185, 180, 227)
            ),
            navigationIcon = {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.Menu, contentDescription = null)
                }
            },
            actions = {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.AccountCircle, contentDescription = "Localized description")
                }
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.MoreVert, contentDescription = "Localized description")
                }
            }
        )
    }









