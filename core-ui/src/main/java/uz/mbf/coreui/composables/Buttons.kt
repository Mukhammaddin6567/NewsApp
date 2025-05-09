package uz.mbf.coreui.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

@AppPreview
@Composable
private fun MyPreview() {
    NewsAppTheme {
        PrimaryButton(onClick = {}, text = "Hello World")
    }
}