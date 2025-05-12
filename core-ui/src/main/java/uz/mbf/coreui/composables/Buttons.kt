package uz.mbf.coreui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = NewsAppTheme.appShape.button,
        colors = ButtonDefaults.buttonColors(containerColor = NewsAppTheme.appColors.primary),
        onClick = onClick,
        content = {
            LinkMedium(
                text = text,
                color = NewsAppTheme.appColors.white
            )
        }
    )
}

@Composable
fun CheckBox(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: () -> Unit
) {
    Checkbox(
        modifier = Modifier.size(NewsAppTheme.appSize.size24dp),
        checked = checked,
        onCheckedChange = { checked.not() },
        colors = CheckboxDefaults.colors(
            checkedColor = NewsAppTheme.appColors.primary,
//            uncheckedColor = NewsAppTheme.appColors.
        ),
    )
}

@Composable
fun BackButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    IconButton(
        modifier = Modifier
            .size(24.dp)
            .then(modifier),
        onClick = onClick
    ) {
        Icon(
            imageVector = Icons.AutoMirrored.Default.ArrowBack,
            contentDescription = null,
            tint = NewsAppTheme.appColors.bodyText
        )
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
            BackButton { }
        }
//        PrimaryButton(onClick = {}, text = "Hello World")


    }
}