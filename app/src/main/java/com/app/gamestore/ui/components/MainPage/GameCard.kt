package com.app.gamestore.ui.components.MainPage

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.gamestore.GameDetailActivity
import com.app.gamestore.R
import com.app.gamestore.models.Game
import com.app.gamestore.viewmodels.GameViewModel

@Composable
fun GameCard(
    game: Game,
    context: Context,
    gamesVM: GameViewModel
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .size(200.dp)
            .clickable {
                gamesVM.selectGame(game)

                val intent = Intent(context, GameDetailActivity::class.java)
                intent.putExtra("selected_game", game)
                context.startActivity(intent)
            }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(game.image),
                contentDescription = stringResource(R.string.game_image_desc),
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .matchParentSize()
            )

            // Dark overlay to make the text readable
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .background(Color.Black.copy(alpha = 0.50f))
            )

            Text(
                text = game.name,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.BottomStart),
                textAlign = TextAlign.Center,
            )
        }
    }
}