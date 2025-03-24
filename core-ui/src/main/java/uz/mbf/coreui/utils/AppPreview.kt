package uz.mbf.coreui.utils

import androidx.compose.ui.tooling.preview.Preview

/**
 * **AppPreview Annotation**
 *
 * This annotation provides a preview for both **Light Mode** and **Dark Mode**.
 * - 🌞 **Light Mode Preview** ✅
 * - 🌙 **Dark Mode Preview** ✅
 *
 * Use `@AppPreview` instead of writing multiple `@Preview` annotations.
 */
@Preview(
    name = "Light Mode",
    showSystemUi = true,
    showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "Dark Mode",
    showSystemUi = true,
    showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES
)
annotation class AppPreview