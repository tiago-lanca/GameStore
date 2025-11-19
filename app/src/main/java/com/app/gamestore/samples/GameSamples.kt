package com.app.gamestore.samples

import com.app.gamestore.R
import com.app.gamestore.models.Game
import com.app.gamestore.models.GameExtension

object GameSamples {

    fun createGame(): Game{
        return Game(
            name = "Anno 117: Pax Romana",
            icon = R.drawable.anno_dlc_prophecies,
            extensions = listOf(
                GameExtension(
                    name = "The Hippodrome",
                    icon = R.drawable.anno_dlc_the_hippodrome,
                    price = 10.0f
                ),
                GameExtension(
                    name = "Dawn of Delta",
                    icon = R.drawable.anno_dlc_dawn_of_delta,
                    price = 20.0f
                ),
                GameExtension(
                    name = "Prophecies of Ash",
                    icon = R.drawable.anno_dlc_prophecies,
                    price = 30.0f
                )
            )
        )
    }
}