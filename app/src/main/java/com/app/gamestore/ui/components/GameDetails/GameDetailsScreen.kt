package com.app.gamestore.ui.components.GameDetails

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.gamestore.R
import com.app.gamestore.models.Game
import com.app.gamestore.models.GameExtension
import com.app.gamestore.samples.GameSamples

@OptIn(ExperimentalMaterial3Api::class)
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
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                                contentDescription = stringResource(R.string.arrow_back_desc),
                                modifier = Modifier
                                    .clickable {
                                        if(context is Activity) context.finish()
                                    }
                            )
                            Text(
                                text = game.name,
                                modifier = Modifier
                                    .padding(start = 15.dp)
                            )

                        }
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = stringResource(R.string.favorite_icon_desc),
                            modifier = Modifier
                                .padding(end = 15.dp)
                        )
                    }
                }
            )
        }
    ) { innerPadding ->

        var showExtensionBuyBottomSheet by remember { mutableStateOf(false) }
        var selectedGameExtension by remember { mutableStateOf<GameExtension?>(null) }


        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .padding(innerPadding)
                .padding(15.dp)
                .fillMaxWidth()
        ) {

            // Game image and description section
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Card(
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier
                        .size(170.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(game.image),
                            contentDescription = stringResource(R.string.game_image_desc),
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .matchParentSize()
                        )
                    }
                }

                Text(
                    text = game.description,
                    textAlign = TextAlign.Start
                )
            }

            Row {
                // Purchasable Items
                Text(
                    text = "Purchasable Items",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 10.dp)
                )
            }

            // List of dlc's / expansions

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .padding(top = 10.dp)
            ) {
                if(game.extensions.isEmpty()){
                    item {
                        Text(
                            text = stringResource(R.string.empty_extensions_list_text),
                            color = Color.Black
                        )
                    }
                }
                else{
                    itemsIndexed(items = game.extensions, key = {_, extension -> extension.id}) { index, extension ->
                        GameExtensionBox(
                            extension = extension,
                            onGameExtensionClick = {
                                selectedGameExtension = it
                                showExtensionBuyBottomSheet = true
                            }
                        )
                    }

                }
            }
            if(showExtensionBuyBottomSheet) {
                ExtensionBuyBottomSheet(
                    extension = selectedGameExtension!!,
                    onDismiss = { showExtensionBuyBottomSheet = false },
                    onBuy = { }
                )
            }
        }
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_9
)
@Composable
fun GameDetailsScreenPreview(){
    GameDetailsScreen(
        game = GameSamples.createGame(),
        context = LocalContext.current
    )
}