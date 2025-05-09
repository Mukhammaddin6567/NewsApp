package uz.mbf.auth.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import uz.mbf.coreui.R
import uz.mbf.coreui.composables.LinkMedium
import uz.mbf.coreui.composables.Spacer4dp
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
internal fun SocialNetworkButton(
    modifier: Modifier = Modifier,
    @DrawableRes logo: Int,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth(),
        shape = NewsAppTheme.appShape.button,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = NewsAppTheme.appColors.secondaryButton),
        content = {
            Image(
                modifier = Modifier
                    .size(NewsAppTheme.appSize.size24dp)
                    .padding(NewsAppTheme.appSize.size2dp),
                painter = painterResource(logo),
                contentDescription = null
            )
            Spacer4dp()
            LinkMedium(
                text = text,
                color = NewsAppTheme.appColors.secondaryTitle,
                maxLines = 1
            )
        }
    )
}

@Composable
@AppPreview
private fun Test() {
    NewsAppTheme {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(NewsAppTheme.appSize.size16dp)
        ) {
            SocialNetworkButton(
                modifier = Modifier.weight(1f),
                text = "Facebook",
                logo = R.drawable.ic_facebook,
                onClick = {}
            )
            SocialNetworkButton(
                modifier = Modifier.weight(1f),
                text = "Google",
                logo = R.drawable.ic_google,
                onClick = {}
            )
        }
    }
}