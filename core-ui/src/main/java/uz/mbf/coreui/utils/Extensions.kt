package uz.mbf.coreui.utils

import android.content.res.Resources

val Float.pxToDp: Float
    get() = this / Resources.getSystem().displayMetrics.density

val Float.dpToPx: Float
    get() = this * Resources.getSystem().displayMetrics.density

val Int.pxToDp: Float
    get() = this / Resources.getSystem().displayMetrics.density

val Int.dpToPx: Float
    get() = this * Resources.getSystem().displayMetrics.density