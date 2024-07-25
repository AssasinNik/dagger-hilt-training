package com.example.dagger_hilt_training

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.dagger_hilt_training.presentation.MyViewModel
import com.example.dagger_hilt_training.ui.theme.DaggerhilttrainingTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerhilttrainingTheme {
                val viewModel = hiltViewModel<MyViewModel>()
            }
        }
    }
}