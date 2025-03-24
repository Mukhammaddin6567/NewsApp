package uz.mbf.newsapp.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

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
    button = RectangleShape
)