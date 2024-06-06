package com.example.myapplication.android.common.theming

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.android.R

val Lato = FontFamily(
    Font(R.font.lato_light, FontWeight.Medium),
    Font(R.font.lato_regular, FontWeight.SemiBold),
    Font(R.font.lato_bold, FontWeight.Bold)
)


val TypographyLato = Typography(
    headlineLarge = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 21.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    )
)