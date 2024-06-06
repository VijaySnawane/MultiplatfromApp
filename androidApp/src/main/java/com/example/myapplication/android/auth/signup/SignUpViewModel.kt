package com.example.myapplication.android.auth.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {
    var uiState by mutableStateOf(SignUpUiState())
        private set
}

data class SignUpUiState(
    val userName: String = "",
    val email: String = "",
    val password: String = ""
)

