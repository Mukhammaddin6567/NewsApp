package uz.mbf.coreui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Immutable
data class AppShape(
    val container: Shape,
    val button: Shape
)

val LocalAppShape = staticCompositionLocalOf<AppShape> {
    AppShape(
        container = RectangleShape,
        button = RectangleShape
    )
}

val appShape = AppShape(
    container = RectangleShape,
    button = RoundedCornerShape(8.dp)
)