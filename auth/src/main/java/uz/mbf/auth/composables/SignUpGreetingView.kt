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
internal fun SignUpGreetingView() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        content = {
            TextDisplayLargeBold(
                text = stringResource(R.string.hello).plus(stringResource(R.string.exclamation)),
                color = NewsAppTheme.appColors.primary
            )
            TextLarge(
                text = stringResource(R.string.sign_up_to_get_started),
                color = NewsAppTheme.appColors.bodyText,
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
            SignUpGreetingView()
        }
    }
}