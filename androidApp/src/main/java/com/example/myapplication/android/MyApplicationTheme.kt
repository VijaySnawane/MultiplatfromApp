package com.example.myapplication.android

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.myapplication.android.common.theming.DarkColors
import com.example.myapplication.android.common.theming.LightColors
import com.example.myapplication.android.common.theming.Shapes
import com.example.myapplication.android.common.theming.TypographyLato

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }
    val typography = TypographyLato
    val shapes = Shapes

    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
