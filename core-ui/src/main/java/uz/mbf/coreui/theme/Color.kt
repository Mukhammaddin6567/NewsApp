package uz.mbf.coreui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

fun ColorScheme.toAppColors(): AppColors {
    return AppColors(
        white = Color.White,
        black = Color.Black,
        title = onBackground,
        secondaryTitle = onSurfaceVariant,
        background = background,
        bodyText = onSurface,
        placeholder = outlineVariant,
        secondaryButton = secondaryContainer,
        input = surfaceVariant,
        primary = primary,

        // Error Colors
        error = error,
        errorLight = onErrorContainer,
        errorDark = errorContainer,

        // Success Colors
        successDefault = Color(0xFF00BA88),  // Keeping custom colors
        successDark = Color(0xFF00966D),
        successDarkMode = Color(0xFF34EAB9),

        // Warning Colors
        warningDefault = Color(0xFFF4B740),
        warningDark = Color(0xFF946200),
        warningDarkMode = Color(0xFFFFD789)
    )
}

@Immutable
data class AppColors(
    val white: Color,
    val black: Color,
    val title: Color,
    val secondaryTitle: Color,
    val background: Color,
    val bodyText: Color,
    val placeholder: Color,
    val secondaryButton: Color,
    val input: Color,
    val primary: Color,

    // Error Colors
    val error: Color,
    val errorLight: Color,
    val errorDark: Color,

    // Success Colors
    val successDefault: Color,
    val successDark: Color,
    val successDarkMode: Color,

    // Warning Colors
    val warningDefault: Color,
    val warningDark: Color,
    val warningDarkMode: Color
)

// Light Theme Colors
val LightAppColors = AppColors(
    white = Color(0xFFFFFFFF), // ✅
    black = Color(0xFF000000), // ✅
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
    errorLight = Color(0xFFED2E7E), // ✅
    errorDark = Color(0xFFED2E7E), // ✅

    // Success Colors
    successDefault = Color(0xFF00BA88), // ✅
    successDark = Color(0xFF00966D), // ✅
    successDarkMode = Color(0xFF34EAB9), // ✅

    // Warning Colors
    warningDefault = Color(0xFFF4B740), // ✅
    warningDark = Color(0xFF946200), // ✅
    warningDarkMode = Color(0xFFFFD789) // ✅
)

// Dark Theme Colors
val DarkAppColors = AppColors(
    white = Color(0xFFFFFFFF), // ✅
    black = Color(0xFF000000), // ✅
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
    errorLight = Color(0xFFC30052), // ✅
    errorDark = Color(0xFFC30052), // ✅

    // Success Colors
    successDefault = Color(0xFF00BA88), // ✅
    successDark = Color(0xFF00966D), // ✅
    successDarkMode = Color(0xFF34EAB9), // ✅

    // Warning Colors
    warningDefault = Color(0xFFF4B740), // ✅
    warningDark = Color(0xFF946200), // ✅
    warningDarkMode = Color(0xFFFFD789) // ✅
)

val LocalAppColors = staticCompositionLocalOf<AppColors> {
    AppColors(
        white = Color.Unspecified,
        black = Color.Unspecified,
        title = Color.Unspecified,
        secondaryTitle = Color.Unspecified,
        background = Color.Unspecified,
        bodyText = Color.Unspecified,
        placeholder = Color.Unspecified,
        secondaryButton = Color.Unspecified,
        input = Color.Unspecified,
        primary = Color.Unspecified,

        // Error Colors
        error = Color.Unspecified,
        errorLight = Color.Unspecified,
        errorDark = Color.Unspecified,

        // Success Colors
        successDefault = Color.Unspecified,
        successDark = Color.Unspecified,
        successDarkMode = Color.Unspecified,

        // Warning Colors
        warningDefault = Color.Unspecified,
        warningDark = Color.Unspecified,
        warningDarkMode = Color.Unspecified
    )
}