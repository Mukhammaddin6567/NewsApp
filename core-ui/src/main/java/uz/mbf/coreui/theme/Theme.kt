package uz.mbf.coreui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember

@Composable
fun NewsAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = remember(darkTheme) { if (darkTheme) DarkAppColors else LightAppColors }

    CompositionLocalProvider(
        LocalAppColors provides colorScheme,
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