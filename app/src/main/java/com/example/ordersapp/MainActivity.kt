package com.example.ordersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.ordersapp.ui.theme.OrdersAppTheme
//test
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrdersAppTheme {
                Text(text = "hey there")
            }
        }
    }
}

