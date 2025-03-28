package uz.mbf.coreui.composables

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
        modifier = Modifier,
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

@AppPreview
@Composable
private fun MyPreview() {
    NewsAppTheme {
        PrimaryButton(onClick = {}, text = "Hello World")
    }
}