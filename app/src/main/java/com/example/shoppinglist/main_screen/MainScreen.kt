package com.example.shoppinglist.main_screen

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.shoppinglist.R

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        bottomBar = {

        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { },
                shape = CircleShape,
            ) {
                Icon(
                    painter = painterResource(R.drawable.add_icon),
                    contentDescription = "Add",
                    tint = Color.White
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {

    }
}