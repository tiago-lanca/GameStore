package com.app.gamestore.models

import java.util.UUID

data class Game(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val icon: Int,
    val extensions: List<GameExtension>
)
