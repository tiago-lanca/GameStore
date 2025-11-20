package com.app.gamestore.ui.components.GameDetails

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.app.gamestore.models.GameExtension
import com.app.gamestore.samples.GameSamples

@Composable
fun ExtensionBuyBottomSheet(
    extension: GameExtension,
    onDismiss: () -> Unit,
    onBuy: () -> Unit
){

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