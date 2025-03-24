package uz.mbf.newsapp.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
data class AppTypography(
    val displayLarge: TextStyle,
    val displayLargeBold: TextStyle,

    val displayMedium: TextStyle,
    val displayMediumBold: TextStyle,

    val displaySmall: TextStyle,
    val displaySmallBold: TextStyle,

    val textLarge: TextStyle,
    val linkLarge: TextStyle,

    val textMedium: TextStyle,
    val linkMedium: TextStyle,

    val textSmall: TextStyle,
    val linkSmall: TextStyle,

    val textXSmall: TextStyle,
    val linkXSmall: TextStyle
)

val LocalAppTypography = staticCompositionLocalOf<AppTypography> {
    AppTypography(
        displayLarge = TextStyle.Default,
        displayLargeBold = TextStyle.Default,
        displayMedium = TextStyle.Default,
        displayMediumBold = TextStyle.Default,

        displaySmall = TextStyle.Default,
        displaySmallBold = TextStyle.Default,

        textLarge = TextStyle.Default,
        linkLarge = TextStyle.Default,

        textMedium = TextStyle.Default,
        linkMedium = TextStyle.Default,

        textSmall = TextStyle.Default,
        linkSmall = TextStyle.Default,

        textXSmall = TextStyle.Default,
        linkXSmall = TextStyle.Default
    )
}

val appTypography = AppTypography(
    displayLarge = TextStyle(
        fontFamily = Poppins,
        fontSize = 48.sp,
        lineHeight = 72.sp,
        fontWeight = FontWeight.Normal,
    ),
    displayLargeBold = TextStyle(
        fontFamily = Poppins,
        fontSize = 48.sp,
        lineHeight = 72.sp,
        fontWeight = FontWeight.Bold
    ),

    displayMedium = TextStyle(
        fontFamily = Poppins,
        fontSize = 28.sp,
        lineHeight = 48.sp,
        fontWeight = FontWeight.Normal,
    ),
    displayMediumBold = TextStyle(
        fontFamily = Poppins,
        fontSize = 28.sp,
        lineHeight = 48.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.12.sp
    ),

    displaySmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 24.sp,
        lineHeight = 36.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.12.sp
    ),
    displaySmallBold = TextStyle(
        fontFamily = Poppins,
        fontSize = 24.sp,
        lineHeight = 36.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.12.sp
    ),

    textLarge = TextStyle(
        fontFamily = Poppins,
        fontSize = 20.sp,
        lineHeight = 30.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.12.sp
    ),
    linkLarge = TextStyle(
        fontFamily = Poppins,
        fontSize = 20.sp,
        lineHeight = 30.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.12.sp
    ),

    textMedium = TextStyle(
        fontFamily = Poppins,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.12.sp
    ),
    linkMedium = TextStyle(
        fontFamily = Poppins,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.12.sp
    ),

    textSmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 14.sp,
        lineHeight = 21.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.12.sp
    ),
    linkSmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 14.sp,
        lineHeight = 21.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.12.sp
    ),

    textXSmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 13.sp,
        lineHeight = 19.5.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.12.sp
    ),
    linkXSmall = TextStyle(
        fontFamily = Poppins,
        fontSize = 13.sp,
        lineHeight = 19.5.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.12.sp
    )
)