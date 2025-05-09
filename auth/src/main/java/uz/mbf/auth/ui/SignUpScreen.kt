package uz.mbf.auth.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import uz.mbf.auth.composables.SignUpGreetingView
import uz.mbf.auth.composables.SocialNetworkButton
import uz.mbf.coreui.R
import uz.mbf.coreui.composables.CheckBox
import uz.mbf.coreui.composables.PrimaryButton
import uz.mbf.coreui.composables.PrimaryOutlinedTextField
import uz.mbf.coreui.composables.Spacer16dp
import uz.mbf.coreui.composables.Spacer2dp
import uz.mbf.coreui.composables.Spacer4dp
import uz.mbf.coreui.composables.Spacer8dp
import uz.mbf.coreui.composables.TextSmall
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun SignUpScreen() {

}

@Composable
private fun SignUpView() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = NewsAppTheme.appColors.background)
            .verticalScroll(state = scrollState)
            .padding(all = NewsAppTheme.appSize.size24dp)
    ) {
        SignUpGreetingView()
        Spacer16dp()
        PrimaryOutlinedTextField(
            isRequiredLabel = true,
            label = stringResource(R.string.username),
            value = "",
            onValueChange = {}
        )
        Spacer8dp()
        PrimaryOutlinedTextField(
            isRequiredLabel = true,
            label = stringResource(R.string.password),
            value = "",
            onValueChange = {}
        )
        Spacer8dp()
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(
                NewsAppTheme.appSize.size4dp
            )
        ) {
            CheckBox(
                checked = true,
                onCheckedChange = {}
            )
            Spacer4dp()
            TextSmall(text = stringResource(R.string.remember_me))
        }
        Spacer8dp()
        PrimaryButton(
            text = stringResource(R.string.sign_up),
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
        Spacer8dp()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,

            ) {
            TextSmall(text = stringResource(R.string.already_have_an_account))
            Spacer2dp()
            TextSmall(
                modifier = Modifier
                    .clickable(onClick = {}),
                text = stringResource(R.string.login),
                color = NewsAppTheme.appColors.primary,
                maxLines = 1,
                textAlign = TextAlign.End
            )
        }
    }
}

@AppPreview
@Composable
private fun SignUpPreview() {
    NewsAppTheme {
        SignUpView()
    }
}