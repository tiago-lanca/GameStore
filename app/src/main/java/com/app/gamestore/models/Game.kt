package com.app.gamestore.models

import android.os.Parcelable
import java.util.UUID
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val description: String,
    val image: Int,
    val extensions: List<GameExtension>
): Parcelable
