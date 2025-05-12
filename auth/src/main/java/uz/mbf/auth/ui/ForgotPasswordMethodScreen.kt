package uz.mbf.auth.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import uz.mbf.auth.composables.RecoverPasswordMethodItem
import uz.mbf.auth.data.RecoveryTypeEnum
import uz.mbf.coreui.R
import uz.mbf.coreui.composables.BackButton
import uz.mbf.coreui.composables.FillMaxWeight
import uz.mbf.coreui.composables.PrimaryButton
import uz.mbf.coreui.composables.Spacer16dp
import uz.mbf.coreui.composables.Spacer8dp
import uz.mbf.coreui.composables.TextDisplayMediumBold
import uz.mbf.coreui.composables.TextMedium
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun ForgotPasswordMethodScreen() {

}

@Composable
private fun ForgotPasswordMethodView() {
    var recoveryType by remember { mutableStateOf(RecoveryTypeEnum.EMAIL) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(NewsAppTheme.appColors.background)
            .padding(all = NewsAppTheme.appSize.size24dp),
        content = {
            BackButton(onClick = {})
            Spacer16dp()
            TextDisplayMediumBold(text = stringResource(R.string.forgot_password))
            Spacer8dp()
            TextMedium(text = stringResource(R.string.forgot_password_hint1))
            Spacer8dp()
            RecoverPasswordMethodItem(
                icon = R.drawable.ic_mail,
                title = R.string.via_email,
                secondaryTitle = R.string.via_email_hint,
                selected = recoveryType == RecoveryTypeEnum.EMAIL,
                onClick = { recoveryType = RecoveryTypeEnum.EMAIL }
            )
            Spacer8dp()
            RecoverPasswordMethodItem(
                icon = R.drawable.ic_message,
                title = R.string.via_sms,
                secondaryTitle = R.string.via_sms_hint,
                selected = recoveryType == RecoveryTypeEnum.SMS,
                onClick = { recoveryType = RecoveryTypeEnum.SMS }
            )
            FillMaxWeight()
            PrimaryButton(
                text = stringResource(R.string.submit),
                onClick = {}
            )
        }
    )
}

@AppPreview
@Composable
private fun ForgotPasswordMethodPreview() {
    NewsAppTheme {
        ForgotPasswordMethodView()
    }
}