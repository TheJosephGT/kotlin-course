package com.example.courses.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DatosDelCard(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
