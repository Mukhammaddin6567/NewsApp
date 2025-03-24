package uz.mbf.coreui.composables

import androidx.annotation.FloatRange
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ColumnScope.FillMaxWeight(@FloatRange weight: Float = 1f, fill: Boolean = true) = Spacer(
    modifier = Modifier.weight(
        weight = weight,
        fill = fill
    )
)

@Composable
fun ColumnScope.FillMaxSize(@FloatRange fraction: Float = 1f) = Spacer(
    modifier = Modifier.fillMaxSize(fraction = fraction)
)


@Composable
fun ColumnScope.FillMaxWidth(@FloatRange fraction: Float = 1f) = Spacer(
    modifier = Modifier.fillMaxWidth(fraction = fraction)
)


@Composable
fun ColumnScope.FillMaxHeight(@FloatRange fraction: Float = 1f) = Spacer(
    modifier = Modifier.fillMaxHeight(fraction = fraction)
)