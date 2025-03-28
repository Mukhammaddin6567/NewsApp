package uz.mbf.coreui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

@Composable
fun NewsAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current

    // Use dynamic colors only if enabled and supported (Android 12+)
    val colorScheme = remember(darkTheme, dynamicColor) {
        if (dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        } else {
            null // This means we will use custom colors instead
        }
    }

    // If dynamicColor is false or not supported, use custom colors
    val appColors = remember {
        colorScheme?.toAppColors() ?: if (darkTheme) DarkAppColors else LightAppColors
    }

    CompositionLocalProvider(
        LocalAppColors provides appColors,
        LocalAppTypography provides appTypography,
        LocalAppShape provides appShape,
        LocalAppSize provides appSize,
        content = content
    )
}

object NewsAppTheme {
    val appColors: AppColors
        @Composable
        get() = LocalAppColors.current

    val appTypography: AppTypography
        @Composable
        get() = LocalAppTypography.current

    val appShape: AppShape
        @Composable
        get() = LocalAppShape.current

    val appSize: AppSize
        @Composable
        get() = LocalAppSize.current
}