package com.app.gamestore.ui.components.GameDetails

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.app.gamestore.models.Game
import com.app.gamestore.samples.GameSamples

@Composable
fun GameDetailsScreen(
    game: Game,
    context: Context
){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Column(

                    ){
                        Row(horizontalArrangement = Arrangement.SpaceBetween)
                    }
                }
            )
        }
    ){ innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
        ){
            Text(game.name)
        }
    }
}


@Preview
@Composable
fun GameDetailsScreenPreview(){
    GameDetailsScreen(
        game = GameSamples.createGame(),
        context = LocalContext.current
    )
}