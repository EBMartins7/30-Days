package com.example.a30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class WellnessTip(
    @StringRes val day: Int,
    @StringRes val tip: Int,
    @StringRes val instruction: Int,
    @DrawableRes val image: Int
)
