package uz.mbf.auth.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import uz.mbf.auth.composables.LoginGreetingView
import uz.mbf.auth.composables.SocialNetworkButton
import uz.mbf.coreui.R
import uz.mbf.coreui.composables.CheckBox
import uz.mbf.coreui.composables.PrimaryButton
import uz.mbf.coreui.composables.PrimaryOutlinedTextField
import uz.mbf.coreui.composables.Spacer16dp
import uz.mbf.coreui.composables.Spacer4dp
import uz.mbf.coreui.composables.Spacer8dp
import uz.mbf.coreui.composables.TextSmall
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun LoginScreen() {

}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun LoginView() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = NewsAppTheme.appColors.background)
            .verticalScroll(state = scrollState)
            .padding(all = NewsAppTheme.appSize.size24dp)
    ) {
        LoginGreetingView()
        Spacer16dp()
        PrimaryOutlinedTextField(
            isRequiredLabel = true,
            label = stringResource(R.string.username),
            value = "",
            onValueChange = {})
        Spacer8dp()
        PrimaryOutlinedTextField(
            isRequiredLabel = true,
            label = stringResource(R.string.password),
            value = "",
            onValueChange = {}
        )
        Spacer4dp()
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
//            maxItemsInEachRow = 2,
            verticalArrangement = Arrangement.Center,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                CheckBox(
                    checked = true,
                    onCheckedChange = {}
                )
                Spacer4dp()
                TextSmall(text = stringResource(R.string.remember_me))
            }
            TextSmall(
                modifier = Modifier
                    .clickable(onClick = {})
                    .align(Alignment.CenterVertically),
                text = stringResource(R.string.forgot_the_password),
                color = NewsAppTheme.appColors.primary,
                textAlign = TextAlign.End
            )
        }
        Spacer8dp()
        PrimaryButton(
            text = stringResource(R.string.login),
            onClick = {}
        )
        Spacer8dp()
        TextSmall(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(R.string.or_continue_with),
            textAlign = TextAlign.Center
        )
        Spacer8dp()
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(NewsAppTheme.appSize.size16dp)
        ) {
            SocialNetworkButton(
                modifier = Modifier.weight(1f),
                text = stringResource(R.string.google),
                logo = R.drawable.ic_google,
                onClick = {}
            )
            SocialNetworkButton(
                modifier = Modifier.weight(1f),
                text = stringResource(R.string.facebook),
                logo = R.drawable.ic_facebook,
                onClick = {}
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@AppPreview
@Composable
private fun DemoPreview() {
    NewsAppTheme {
        LoginView()
    }
}