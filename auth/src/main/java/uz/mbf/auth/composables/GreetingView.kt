package uz.mbf.auth.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import uz.mbf.coreui.R
import uz.mbf.coreui.composables.TextDisplayLargeBold
import uz.mbf.coreui.composables.TextLarge
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
internal fun GreetingView() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        content = {
            TextDisplayLargeBold(
                text = stringResource(R.string.hello),
                color = NewsAppTheme.appColors.title
            )
            TextDisplayLargeBold(
                text = stringResource(R.string.again),
                color = NewsAppTheme.appColors.primary
            )
            TextLarge(
                text = stringResource(R.string.welcome_back),
                color = NewsAppTheme.appColors.bodyText,
                maxLines = 2
            )
        }
    )
}

@AppPreview
@Composable
private fun MyPreview() {
    NewsAppTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(NewsAppTheme.appColors.background)
        ) {
            GreetingView()
        }
    }
}