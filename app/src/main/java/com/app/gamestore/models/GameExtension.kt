package com.app.gamestore.models

import java.util.UUID

data class GameExtension(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val icon: Int,
    val price: Float
)
