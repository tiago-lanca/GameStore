package com.app.gamestore.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import com.app.gamestore.R
import com.app.gamestore.models.IconHandler

enum class NavbarOptions(
    val route: String,
    val label: String,
    val icon: IconHandler,
    val contentDescription: String
){
    FEATURED("featured", "Featured", IconHandler.PainterImage(R.drawable.star_24px), "Featured icon"),
    HISTORY("history", "History", IconHandler.PainterImage(R.drawable.archive_24px), "History icon"),
    PROFILE("profile", "Profile", IconHandler.ImageVectorImage( Icons.Outlined.Person), "Profile icon")
}