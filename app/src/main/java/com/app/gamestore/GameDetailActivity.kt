package com.app.gamestore

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.app.gamestore.ui.theme.GameStoreTheme
import com.app.gamestore.models.Game
import com.app.gamestore.samples.GameSamples
import com.app.gamestore.ui.components.GameDetails.GameDetailsScreen

class GameDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameStoreTheme {
                val context = LocalContext.current

                @Suppress("DEPRECATION")
                val selectedGame = intent.getParcelableExtra<Game>("selected_game")

                GameDetailsScreen(selectedGame!!, context)

            }
        }
    }
}

@Preview
@Composable
fun GameDetailActivityPreview(){
    GameDetailActivity()
}
