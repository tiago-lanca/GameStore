package com.app.gamestore.viewmodels

import androidx.lifecycle.ViewModel
import com.app.gamestore.R
import com.app.gamestore.models.Game
import com.app.gamestore.models.GameExtension
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GameViewModel : ViewModel() {
    private val _gamesList = MutableStateFlow<List<Game>>(emptyList())
    val gamesList: StateFlow<List<Game>> = _gamesList

    private val _selectedGame = MutableStateFlow<Game?>(null)
    val selectedGame: StateFlow<Game?> = _selectedGame

    init { loadGames() }

    fun loadGames(){
        _gamesList.value = listOf<Game>(
            Game(
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
            ),

            Game(
                name = "Anno 117: Pax Romana",
                description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                image = R.drawable.anno_dlc_prophecies,
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
            ),

            Game(
                name = "Anno 117: Pax Romana",
                description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                image = R.drawable.anno_dlc_dawn_of_delta,
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
            ),

            Game(
                name = "Anno 117: Pax Romana",
                description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                image = R.drawable.anno_dlc_the_hippodrome,
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
        )
    }

    fun selectGame(game: Game){
        _selectedGame.value = game
    }
}