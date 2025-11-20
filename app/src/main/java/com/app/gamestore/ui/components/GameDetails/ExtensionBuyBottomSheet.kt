package com.app.gamestore.ui.components.GameDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.gamestore.R
import com.app.gamestore.models.GameExtension
import com.app.gamestore.samples.GameSamples
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExtensionBuyBottomSheet(
    extension: GameExtension,
    onDismiss: () -> Unit,
    onBuy: () -> Unit
){

    val scope = rememberCoroutineScope()
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = false)

    LaunchedEffect(Unit) {
        sheetState.partialExpand()
    }

    ModalBottomSheet(
        onDismissRequest = {
            scope.launch {
                sheetState.hide()
                onDismiss()
            }
        },
        sheetState = sheetState,
        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
    ) {

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            // Extension Name
            Row(
                horizontalArrangement = Arrangement.Start
            ){
                Text(
                    text = extension.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            // Image + Description
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp),
            ){
                // Extension Image
                Card(
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .size(140.dp)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(extension.image),
                            contentDescription = stringResource(R.string.extension_image_desc),
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .matchParentSize()
                        )
                    }
                }

                // Extension Description
                Text(
                    extension.description,
                    color = Color.DarkGray
                )
            }

            // Price + Buy button
            Row(
                horizontalArrangement = Arrangement.spacedBy(15.dp, Alignment.End),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                // Price
                Text(
                    text = "$${extension.price}",
                    fontSize = 20.sp,
                    color = Color.DarkGray,
                )

                // Buy button
                Button(
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF65558f),
                        contentColor = Color.White
                    ),
                    onClick = { onBuy() }
                ) {
                    Text("Buy with 1-click")
                }
            }
        }
    }
}


@Preview
@Composable
fun ExtensionBuyBottomSheetPreview(){
    ExtensionBuyBottomSheet(
        extension = GameSamples.createGameExtension(),
        onDismiss = {},
        onBuy = {}
    )
}