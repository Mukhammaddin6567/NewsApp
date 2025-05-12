package uz.mbf.auth.composables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import uz.mbf.coreui.R
import uz.mbf.coreui.composables.FillMaxWeight
import uz.mbf.coreui.composables.Spacer8dp
import uz.mbf.coreui.composables.TextMedium
import uz.mbf.coreui.composables.TextSmall
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun RecoverPasswordMethodItem(
    @DrawableRes icon: Int,
    @StringRes title: Int,
    @StringRes secondaryTitle: Int,
    selected: Boolean,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(NewsAppTheme.appShape.button)
            .clickable(onClick = onClick)
            .background(NewsAppTheme.appColors.secondaryButton)
            .padding(all = NewsAppTheme.appSize.size16dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .size(NewsAppTheme.appSize.size48dp)
                .clip(NewsAppTheme.appShape.button)
                .background(NewsAppTheme.appColors.primary)
                .padding(all = NewsAppTheme.appSize.size16dp),
            painter = painterResource(icon),
            contentDescription = null, tint = NewsAppTheme.appColors.white
        )
        Spacer8dp()
        Column(verticalArrangement = Arrangement.Center) {
            TextSmall(
                text = stringResource(title),
                color = NewsAppTheme.appColors.secondaryTitle,
                maxLines = 1
            )
            TextMedium(
                text = stringResource(secondaryTitle),
                color = NewsAppTheme.appColors.title,
                maxLines = 1
            )
        }
        FillMaxWeight()
        Spacer8dp()
        RadioButton(
            modifier = Modifier.size(NewsAppTheme.appSize.size24dp),
            selected = selected,
            onClick = onClick,
            colors = RadioButtonDefaults.colors(
                selectedColor = NewsAppTheme.appColors.primary,
                unselectedColor = NewsAppTheme.appColors.secondaryTitle.copy(alpha = 0.3f)
            )
        )
    }
}

@AppPreview
@Composable
private fun RecoverPasswordMethodItemPreview() {
    NewsAppTheme {
        Column {
            RecoverPasswordMethodItem(
                title = R.string.password,
                secondaryTitle = R.string.forgot_password,
                selected = true,
                icon = R.drawable.ic_mail,
                onClick = {}
            )
            Spacer8dp()
            RecoverPasswordMethodItem(
                title = R.string.forgot_password,
                secondaryTitle = R.string.forgot_password,
                selected = false,
                icon = R.drawable.ic_message,
                onClick = {}
            )
        }

    }
}