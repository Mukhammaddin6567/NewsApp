package uz.mbf.coreui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class AppSize(
    val size4Dp: Dp,
    val size8Dp: Dp,
    val size12Dp: Dp,
    val size16Dp: Dp,
    val size20Dp: Dp,
    val size24Dp: Dp,
    val size32Dp: Dp,
    val size40Dp: Dp,
    val size50Dp: Dp,
    val size56Dp: Dp,
    val size64Dp: Dp,
    val size96Dp: Dp,
    val size128Dp: Dp
)

val LocalAppSize = staticCompositionLocalOf<AppSize> {
    AppSize(
        size4Dp = 4.dp,
        size8Dp = 8.dp,
        size12Dp = 12.dp,
        size16Dp = 16.dp,
        size20Dp = 20.dp,
        size24Dp = 24.dp,
        size32Dp = 32.dp,
        size40Dp = 40.dp,
        size50Dp = 50.dp,
        size56Dp = 56.dp,
        size64Dp = 64.dp,
        size96Dp = 96.dp,
        size128Dp = 128.dp
    )
}

val appSize = AppSize(
    size4Dp = 4.dp,
    size8Dp = 8.dp,
    size12Dp = 12.dp,
    size16Dp = 16.dp,
    size20Dp = 20.dp,
    size24Dp = 24.dp,
    size32Dp = 32.dp,
    size40Dp = 40.dp,
    size50Dp = 50.dp,
    size56Dp = 56.dp,
    size64Dp = 64.dp,
    size96Dp = 96.dp,
    size128Dp = 128.dp
)