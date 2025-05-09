package uz.mbf.coreui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.dp

@Immutable
data class AppSize(
    val size2dp: Dp,
    val size4dp: Dp,
    val size8dp: Dp,
    val size12dp: Dp,
    val size16dp: Dp,
    val size20dp: Dp,
    val size24dp: Dp,
    val size32dp: Dp,
    val size40dp: Dp,
    val size50dp: Dp,
    val size56dp: Dp,
    val size64dp: Dp,
    val size96dp: Dp,
    val size128dp: Dp
)

val LocalAppSize = staticCompositionLocalOf<AppSize> {
    AppSize(
        size2dp = 2.dp,
        size4dp = 4.dp,
        size8dp = 8.dp,
        size12dp = 12.dp,
        size16dp = 16.dp,
        size20dp = 20.dp,
        size24dp = 24.dp,
        size32dp = 32.dp,
        size40dp = 40.dp,
        size50dp = 50.dp,
        size56dp = 56.dp,
        size64dp = 64.dp,
        size96dp = 96.dp,
        size128dp = 128.dp
    )
}

val appSize = AppSize(
    size2dp = 2.dp,
    size4dp = 4.dp,
    size8dp = 8.dp,
    size12dp = 12.dp,
    size16dp = 16.dp,
    size20dp = 20.dp,
    size24dp = 24.dp,
    size32dp = 32.dp,
    size40dp = 40.dp,
    size50dp = 50.dp,
    size56dp = 56.dp,
    size64dp = 64.dp,
    size96dp = 96.dp,
    size128dp = 128.dp
)