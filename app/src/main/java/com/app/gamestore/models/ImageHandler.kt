package com.app.gamestore.models

import java.io.Serializable

sealed class ImageHandler : Serializable {
    data class ResourceImage(val resourceId: Int) : ImageHandler()
    data class UrlImage(val url: String) : ImageHandler()
}
