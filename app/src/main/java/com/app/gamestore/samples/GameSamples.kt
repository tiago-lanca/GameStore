package com.app.gamestore.samples

import com.app.gamestore.R
import com.app.gamestore.models.Game
import com.app.gamestore.models.GameExtension

object GameSamples {

    fun createGame(): Game{
        return Game(
            name = "Anno 117: Pax Romana",
            description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
            image = R.drawable.anno_game,
            extensions = listOf(
                GameExtension(
                    name = "The Hippodrome",
                    description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades.",
                    image = R.drawable.anno_dlc_the_hippodrome,
                    price = 12.99f
                ),
                GameExtension(
                    name = "Dawn of Delta",
                    description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades.",
                    image = R.drawable.anno_dlc_dawn_of_delta,
                    price = 12.99f
                ),
                GameExtension(
                    name = "Prophecies of Ash",
                    description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades.",
                    image = R.drawable.anno_dlc_prophecies,
                    price = 12.99f
                )
            )
        )
    }
}