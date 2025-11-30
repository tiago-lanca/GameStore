package com.app.gamestore.models

import java.io.Serializable
import java.util.UUID

data class Game(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val description: String,
    val image: ImageHandler,
    val extensions: List<GameExtension>
): Serializable
