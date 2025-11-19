package com.app.gamestore.viewmodels

import androidx.compose.ui.res.painterResource
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
                icon = R.drawable.anno_game,
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
            ),

            Game(
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
            ),

            Game(
                name = "Anno 117: Pax Romana",
                icon = R.drawable.anno_dlc_dawn_of_delta,
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
            ),

            Game(
                name = "Anno 117: Pax Romana",
                icon = R.drawable.anno_dlc_the_hippodrome,
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
        )
    }

    fun selectGame(game: Game){
        _selectedGame.value = game
    }
}