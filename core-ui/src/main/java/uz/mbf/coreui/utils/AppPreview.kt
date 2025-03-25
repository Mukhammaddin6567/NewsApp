package uz.mbf.coreui.utils

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Devices.NEXUS_5
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
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO,
    device = NEXUS_5
)
@Preview(
    name = "Dark Mode",
    showSystemUi = true,
    showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES,
    device = NEXUS_5
)
annotation class AppPreview