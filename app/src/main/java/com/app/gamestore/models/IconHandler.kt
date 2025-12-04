package com.app.gamestore.models

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

sealed class IconHandler {
    data class ImageVectorImage(val imageVector: ImageVector) : IconHandler()
    data class PainterImage(val resourceId: Int) : IconHandler()
}