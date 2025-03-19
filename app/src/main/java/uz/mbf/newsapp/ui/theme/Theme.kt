package uz.mbf.newsapp.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Light Theme Colors
val LightColors = CustomColorScheme(
    title = Color(0xFF050505), // ✅
    secondaryTitle = Color(0xFF667080), // ✅
    background = Color(0xFFFFFFFF), // ✅
    bodyText = Color(0xFF4E4B66), // ✅
    placeholder = Color(0xFFA0A3BD), // ✅
    secondaryButton = Color(0xFFEEF1F4), // ✅
    input = Color(0xFFEEF1F4), // ✅
    primary = Color(0xFF1877F2), // ✅

    // Error Colors
    error = Color(0xFFED2E7E), // ✅
    errorContainer = Color(0xFFFF83B7), // ✅

    // Success Colors
    successDefault = Color(0xFF00BA88), // ✅
    successDark = Color(0xFF00966D), // ✅
    successDarkMode = Color(0xFF34EAB9), // ✅

    // Warning Colors
    warningDefault = Color(0xFFF4B740), // ✅
    warningDark = Color(0xFF946200), // ✅
    warningDarkMode = Color(0xFFFFD789), // ✅
)

// Dark Theme Colors
val DarkColors = CustomColorScheme(
    title = Color(0xFFE4E6EB), // ✅
    secondaryTitle = Color(0xFF667080), // ✅
    background = Color(0xFF1C1E21), // ✅
    bodyText = Color(0xFFB0B3B8), // ✅
    placeholder = Color(0xFFA0A3BD), // ✅
    secondaryButton = Color(0xFFEEF1F4), // ✅
    input = Color(0xFF3A3B3C), // ✅
    primary = Color(0xFF1877F2), // ✅

    // Error Colors
    error = Color(0xFFC30052), // ✅
    errorContainer = Color(0xFFED2E7E), // ✅

    // Success Colors
    successDefault = Color(0xFF00BA88), // ✅
    successDark = Color(0xFF00966D), // ✅
    successDarkMode = Color(0xFF34EAB9), // ✅

    // Warning Colors
    warningDefault = Color(0xFFF4B740), // ✅
    warningDark = Color(0xFF946200), // ✅
    warningDarkMode = Color(0xFFFFD789), // ✅


)

// Global access to colors
val LocalCustomColors = staticCompositionLocalOf { LightColors }

@Composable
fun NewsAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val materialColorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkColorScheme()
        else -> lightColorScheme()
    }

    val customColors = if (darkTheme) DarkColors else LightColors

    CompositionLocalProvider(LocalCustomColors provides customColors) {
        MaterialTheme(
            colorScheme = materialColorScheme,
            typography = Typography,
            content = content
        )
    }
}

// Helper function to access colors easily
@Composable
fun colors() = LocalCustomColors.current