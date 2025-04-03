package uz.mbf.onboarding.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Immutable
import uz.mbf.coreui.R

@Immutable
data class OnBoardingContentData(
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val subtitle: Int
)

internal val contentList = listOf<OnBoardingContentData>(
    OnBoardingContentData(
        image = R.drawable.ic_onboarding1,
        title = R.string.onboarding_title1,
        subtitle = R.string.onboarding_subtitle1
    ),
    OnBoardingContentData(
        image = R.drawable.ic_onboarding2,
        title = R.string.onboarding_title2,
        subtitle = R.string.onboarding_subtitle2
    ),
    OnBoardingContentData(
        image = R.drawable.ic_onboarding3,
        title = R.string.onboarding_title3,
        subtitle = R.string.onboarding_subtitle3
    )
)