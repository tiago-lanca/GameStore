package com.app.gamestore.viewmodels

import androidx.lifecycle.ViewModel
import com.app.gamestore.R
import com.app.gamestore.models.Game
import com.app.gamestore.models.GameExtension
import com.app.gamestore.models.ImageHandler
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
                image = ImageHandler.ResourceImage(R.drawable.anno_dlc_dawn_of_delta),
                //ImageHandler.getImageFromURL()
                extensions = listOf(
                    GameExtension(
                        name = "The Hippodrome",
                        description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                        image = ImageHandler.ResourceImage(R.drawable.anno_game),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "Dawn of Delta",
                        description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                        image = ImageHandler.ResourceImage(R.drawable.anno_dlc_dawn_of_delta),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "Prophecies of Ash",
                        description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                        image = ImageHandler.ResourceImage(R.drawable.anno_dlc_prophecies),
                        price = 12.99f
                    )
                )
            ),

            Game(
                name = "Euro Truck Simulator 2",
                description = "Viaje pela Europa como o rei da estrada, um camionista que entrega cargas importantes por distâncias impressionantes!",
                image = ImageHandler.ResourceImage(R.drawable.ets2_principal),
                extensions = listOf(
                    GameExtension(
                        name = "Iberia",
                        description = "Seja uma parte importante da forte economia de exportação e entregue cargas da Península Ibérica pela Europa.",
                        image = ImageHandler.ResourceImage(R.drawable.ets2_dlc_iberia),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "West Balkans",
                        description = "Descubra, faça entregas e expanda a sua empresa de transporte para a Albânia, Bósnia e Herzegovina, Croácia, Kosovo, Montenegro, Macedônia do Norte, Sérvia e Eslovênia.",
                        image = ImageHandler.ResourceImage(R.drawable.ets2_dlc_westbalkans),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "Vive la France",
                        description = "Percorra as amplas avenidas de cidades industriais e ruas estreitas de vilarejos rurais. Aproveite a natureza francesa com as suas paisagens diversas e vegetação díspar de norte a sul.",
                        image = ImageHandler.ResourceImage(R.drawable.ets2_dlc_vivelafrance),
                        price = 12.99f
                    )
                )
            ),

            Game(
                name = "Tropico 6",
                description = "Tropico 6 é um jogo de simulação de cidade onde o jogador assume o papel de um líder (ditador ou estadista) de um arquipélago chamado Tropico.",
                image = ImageHandler.ResourceImage(R.drawable.tropico6),
                extensions = listOf(
                    GameExtension(
                        name = "Return Nature",
                        description = "Foca em tornar Tropico mais verde, adicionando 15 novos edifícios como Escolas Florestais e Casas na Árvore, a Maravilha do Mundo personalizável Biggdrasil, e uma nova métrica chamada \"Natureza\".",
                        image = ImageHandler.ResourceImage(R.drawable.tropico6_dlc_return_nature),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "Tropican Shores",
                        description = "Traz-te uma infinidade de novas oportunidades para construíres e expandires a tua ilha sobre o oceano.",
                        image = ImageHandler.ResourceImage(R.drawable.tropico6_dlc_tropican_shores),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "Going Viral",
                        description = "A saúde e prosperidade da tua nação estão em risco enquanto doenças contagiosas se espalham pela tua ilha paradisíaca.",
                        image = ImageHandler.ResourceImage(R.drawable.tropico6_dlc_going_viral),
                        price = 12.99f
                    )
                )
            ),

            /*Game(
                name = "Anno 117: Pax Romana",
                description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                image = ImageHandler.ResourceImage(R.drawable.anno_dlc_the_hippodrome),
                extensions = listOf(
                    GameExtension(
                        name = "The Hippodrome",
                        description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                        image = ImageHandler.ResourceImage(R.drawable.anno_dlc_the_hippodrome),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "Dawn of Delta",
                        description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                        image = ImageHandler.ResourceImage(R.drawable.anno_dlc_dawn_of_delta),
                        price = 12.99f
                    ),
                    GameExtension(
                        name = "Prophecies of Ash",
                        description = "No Anno 117 é um jogo histórico de estratégia e construção de cidades no império romano.Construa cidades e lidere rebeliões.",
                        image = ImageHandler.ResourceImage(R.drawable.anno_dlc_prophecies),
                        price = 12.99f
                    )
                )
            )*/
        )
    }

    fun selectGame(game: Game){
        _selectedGame.value = game
    }
}