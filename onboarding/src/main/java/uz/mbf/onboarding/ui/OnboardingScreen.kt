package uz.mbf.onboarding.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import kotlinx.coroutines.launch
import uz.mbf.coreui.R
import uz.mbf.coreui.composables.LinkMedium
import uz.mbf.coreui.composables.PrimaryButton
import uz.mbf.coreui.composables.Spacer24dp
import uz.mbf.coreui.composables.Spacer4dp
import uz.mbf.coreui.composables.Spacer8dp
import uz.mbf.coreui.composables.TextDisplaySmallBold
import uz.mbf.coreui.composables.TextMedium
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun OnboardingScreen() {
    OnboardingView()
}

@Composable
private fun OnboardingView() {
    val coroutineScope = rememberCoroutineScope()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(NewsAppTheme.appColors.background)
            .padding(bottom = NewsAppTheme.appSize.size40dp),
        content = {
            val pagerState = rememberPagerState(pageCount = { contentList.size })
            val data by remember { derivedStateOf { contentList[pagerState.currentPage] } }
            HorizontalPager(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.86f),
                state = pagerState,
                pageContent = {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        content = {
                            Image(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(0.72f),
                                painter = painterResource(data.image),
                                contentDescription = null,
                                contentScale = ContentScale.Crop
                            )
                            Spacer24dp()
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(0.28f)
                                    .padding(horizontal = NewsAppTheme.appSize.size24dp),
                                content = {
                                    TextDisplaySmallBold(
                                        text = stringResource(data.title),
                                        color = NewsAppTheme.appColors.title
                                    )
                                    TextMedium(
                                        text = stringResource(data.subtitle),
                                        color = NewsAppTheme.appColors.bodyText
                                    )
                                }
                            )
                        }
                    )
                }
            )
            BottomContent(
                currentPage = pagerState.currentPage,
                onClickBack = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage - 1)
                    }
                },
                onClickNext = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
                    }
                },
                onClickGetStarted = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(0)
                    }
                }
            )
        }
    )
}

@Composable
private fun DotView(
    isActive: Boolean = false
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (isActive) NewsAppTheme.appColors.primary else NewsAppTheme.appColors.placeholder,
        animationSpec = tween(durationMillis = 750) // 1 second animation
    )

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(NewsAppTheme.appSize.size16dp)
            .background(backgroundColor)
    )
}

@Composable
private fun BottomContent(
    currentPage: Int,
    onClickBack: () -> Unit,
    onClickNext: () -> Unit,
    onClickGetStarted: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = NewsAppTheme.appSize.size24dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        content = {
            Row(
                content = {
                    repeat(
                        times = contentList.size,
                        action = { index ->
                            DotView(isActive = currentPage == index)
                            if (index != contentList.size - 1) Spacer4dp()
                        }
                    )
                }
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                content = {
                    AnimatedVisibility(
                        visible = currentPage != 0,
                        content = {
                            LinkMedium(
                                modifier = Modifier
                                    .padding(end = NewsAppTheme.appSize.size8dp).clickable(
                                    onClick = onClickBack,
                                    role = Role.Button
                                ),
                                text = stringResource(R.string.back),
                                color = NewsAppTheme.appColors.bodyText
                            )
                            Spacer8dp()
                        }
                    )
                    PrimaryButton(
                        text = stringResource(if (currentPage == contentList.size - 1) R.string.get_started else R.string.next),
                        onClick = if (currentPage != contentList.size - 1) onClickNext else onClickGetStarted
                    )
                }
            )
        }
    )
}

@Immutable
data class OnBoardingContentData(
    @DrawableRes val image: Int,
    @StringRes val title: Int,
    @StringRes val subtitle: Int
)

private val contentList = listOf<OnBoardingContentData>(
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

@AppPreview
@Composable
private fun MyPreview() {
    NewsAppTheme {
        OnboardingView()
    }
}