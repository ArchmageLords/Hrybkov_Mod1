package com.example.hrybkov_mod1

import androidx.annotation.DrawableRes

data class ListItem (
    val title: String,
    val quantity: String,
    @DrawableRes val image: Int
    )