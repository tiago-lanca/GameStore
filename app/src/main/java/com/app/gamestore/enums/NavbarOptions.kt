package com.app.gamestore.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Archive
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.ui.graphics.vector.ImageVector

enum class NavbarOptions(
    val route: String,
    val label: String,
    val icon: ImageVector,
    val contentDescription: String
){
    FEATURED("featured", "Featured", Icons.Outlined.StarOutline, "Featured icon"),
    HISTORY("history", "History", Icons.Outlined.Archive, "History icon"),
    PROFILE("profile", "Profile", Icons.Outlined.Person, "Profile icon")
}