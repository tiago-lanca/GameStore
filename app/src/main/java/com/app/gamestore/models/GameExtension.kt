package com.app.gamestore.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

@Parcelize
data class GameExtension(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val description: String,
    val image: Int,
    val price: Float
): Parcelable
