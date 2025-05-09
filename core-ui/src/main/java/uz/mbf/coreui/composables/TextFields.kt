package uz.mbf.coreui.composables

import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uz.mbf.coreui.R
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun PrimaryOutlinedTextField(
    modifier: Modifier = Modifier,
    label: String? = null,
    isRequiredLabel: Boolean = false,
    value: String,
    onValueChange: (String) -> Unit,
    @DrawableRes trailingIcon: Int? = null,
    onClickTrailingIcon: () -> Unit = { },
    isError: Boolean = false,
    errorText: String? = null
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        if (label != null) {
            LabelText(
                text = label,
                isRequired = isRequiredLabel
            )
            Spacer4dp()
        }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .then(modifier),
            value = value,
            onValueChange = onValueChange,
            trailingIcon = {
                if (trailingIcon != null) {
                    if (value.isNotBlank()) {
                        AppIcon(
                            painterResource = trailingIcon,
                            onClick = onClickTrailingIcon,
                            tint = if (isError) NewsAppTheme.appColors.error else NewsAppTheme.appColors.bodyText
                        )
                    }
                }
            },
            colors = TextFieldDefaults.colors(
                errorCursorColor = NewsAppTheme.appColors.errorDark,
                errorContainerColor = NewsAppTheme.appColors.black,
                disabledContainerColor = NewsAppTheme.appColors.input,
                focusedContainerColor = NewsAppTheme.appColors.input,
                unfocusedContainerColor = NewsAppTheme.appColors.input,
            )
        )
        if (errorText != null) {
            AnimatedVisibility(isError) {
                ErrorText(
                    modifier = Modifier.padding(top = NewsAppTheme.appSize.size4dp),
                    text = errorText
                )
            }
        }
    }
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
            PrimaryOutlinedTextField(
                value = "Salom",
                onValueChange = {},
                label = "Required",
                isRequiredLabel = true,
                errorText = "Error",
                isError = false,
                trailingIcon = R.drawable.ic_close,
            )
        }

    }
}