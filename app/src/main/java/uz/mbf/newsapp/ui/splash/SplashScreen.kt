package uz.mbf.newsapp.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import uz.mbf.coreui.R
import uz.mbf.coreui.theme.NewsAppTheme
import uz.mbf.coreui.utils.AppPreview

@Composable
fun SplashScreen() {
    SplashView()
}

@Composable
private fun SplashView() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = NewsAppTheme.appColors.background),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.padding(bottom = NewsAppTheme.appSize.size128dp),
            painter = painterResource(R.drawable.ic_splash),
            contentDescription = null
        )
    }
}

@AppPreview
@Composable
private fun MyPreview() {
    NewsAppTheme {
        SplashView()
    }
}