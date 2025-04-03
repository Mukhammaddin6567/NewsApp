package uz.mbf.coreui.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import uz.mbf.coreui.R
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun AppIcon(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isClickable: Boolean = true,
    @DrawableRes painterResource: Int,
    tint: Color = NewsAppTheme.appColors.bodyText
) {
    Icon(
        modifier = Modifier
            .size(24.dp)
            .then(modifier)
            .clickable(
                enabled = isClickable,
                onClick = onClick,
                role = Role.Button
            )
            .indication(
                interactionSource = remember { MutableInteractionSource() },
                indication = ripple()
            ),
        painter = painterResource(id = painterResource),
        tint = tint,
        contentDescription = null
    )
}

@AppPreview
@Composable
private fun MyPreview() {
    NewsAppTheme {
        AppIcon(onClick = {}, painterResource = R.drawable.ic_close)
    }
}