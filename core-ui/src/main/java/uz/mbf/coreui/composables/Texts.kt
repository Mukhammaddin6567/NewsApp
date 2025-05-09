package uz.mbf.coreui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import uz.mbf.coreui.R
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun TextDisplayLarge(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.displayLarge,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextDisplayLargeBold(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.displayLargeBold,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextDisplayMedium(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.displayMedium,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextDisplayMediumBold(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.displayMediumBold,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextDisplaySmall(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.displaySmall,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextDisplaySmallBold(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.displaySmallBold,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextLarge(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.textLarge,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun LinkLarge(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.linkLarge,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextMedium(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.textMedium,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun LinkMedium(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.linkMedium,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextSmall(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.textSmall,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun LinkSmall(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.linkSmall,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun TextXSmall(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.textXSmall,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun LinkXSmall(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = NewsAppTheme.appColors.title,
    maxLines: Int = Int.MAX_VALUE,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = text,
        style = NewsAppTheme.appTypography.linkXSmall,
        textAlign = textAlign,
        color = color,
        maxLines = maxLines,
        overflow = overFlow
    )
}

@Composable
fun LabelText(
    modifier: Modifier = Modifier,
    text: String,
    isRequired: Boolean = false,
    color: Color = NewsAppTheme.appColors.bodyText,
    textAlign: TextAlign = TextAlign.Unspecified,
    overFlow: TextOverflow = TextOverflow.Clip
) {
    Text(
        modifier = modifier,
        text = buildAnnotatedString {
            append(text)
            if (isRequired) {
                pushStyle(SpanStyle(color = Color(0xFFC30052))) // Red asterisk
                append("*")
            }
            pop()
        },
        style = NewsAppTheme.appTypography.textSmall,
        textAlign = textAlign,
        color = color,
        maxLines = 1,
        overflow = overFlow
    )
}

@Composable
fun ErrorText(
    modifier: Modifier = Modifier,
    text: String
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(R.drawable.ic_error),
            tint = NewsAppTheme.appColors.errorDark,
            contentDescription = null
        )
        Spacer2dp()
        TextSmall(
            modifier = modifier,
            text = text,
            color = NewsAppTheme.appColors.errorDark
        )
    }

}

@Preview
@Composable
private fun Test() {
    NewsAppTheme {
//        LabelText(text = "Required", isRequired = true)
        ErrorText(text = "Error")
    }
}

@AppPreview
@Composable
private fun MyPreview() {
    NewsAppTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(NewsAppTheme.appColors.background)
        ) {
            LabelText(text = "Required")

            /*TextDisplayLarge(
                text = "TextDisplayLarge",
                maxLines = 1,
                overFlow = TextOverflow.Ellipsis
            )
            TextDisplayMedium(
                text = "TextDisplayMedium",
                maxLines = 1,
                overFlow = TextOverflow.Ellipsis
            )
            TextDisplaySmall(
                text = "TextDisplaySmall",
                maxLines = 1,
                overFlow = TextOverflow.Ellipsis
            )
            TextLarge(text = "TextLarge", maxLines = 1, overFlow = TextOverflow.Ellipsis)
            TextMedium(text = "TextMedium", maxLines = 1, overFlow = TextOverflow.Ellipsis)
            TextSmall(text = "TextSmall", maxLines = 1, overFlow = TextOverflow.Ellipsis)
            TextXSmall(text = "TextXSmall", maxLines = 1, overFlow = TextOverflow.Ellipsis)

            Spacer48dp()

            TextDisplayLargeBold(
                text = "TextDisplayLargeBold",
                maxLines = 1,
                overFlow = TextOverflow.Ellipsis
            )
            TextDisplayMediumBold(
                text = "TextDisplayMediumBold",
                maxLines = 1,
                overFlow = TextOverflow.Ellipsis
            )
            TextDisplaySmallBold(
                text = "TextDisplaySmallBold",
                maxLines = 1,
                overFlow = TextOverflow.Ellipsis
            )
            LinkLarge(text = "LinkLarge", maxLines = 1, overFlow = TextOverflow.Ellipsis)
            LinkMedium(text = "LinkMedium", maxLines = 1, overFlow = TextOverflow.Ellipsis)
            LinkSmall(text = "LinkSmall", maxLines = 1, overFlow = TextOverflow.Ellipsis)
            LinkXSmall(text = "LinkXSmall", maxLines = 1, overFlow = TextOverflow.Ellipsis)*/
        }
    }
}