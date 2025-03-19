package uz.mbf.newsapp.ui.theme

import androidx.compose.ui.graphics.Color

data class CustomColorScheme(
    val title: Color,
    val background: Color,
    val bodyText: Color,
    val buttonText: Color,
    val placeholder: Color,
    val secondaryButton: Color,
    val input: Color,
    val primary: Color,

    // Error Colors
    val errorContainer: Color,
    val error: Color,

    // Success Colors
    val successDefault: Color,
    val successDark: Color,
    val successDarkMode: Color,

    // Warning Colors
    val warningDefault: Color,
    val warningDark: Color,
    val warningDarkMode: Color
)