package com.app.gamestore.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.app.gamestore.R
import com.app.gamestore.models.ImageHandler

@Composable
fun GameImageView(
    image: ImageHandler,
    contentScale: ContentScale,
    modifier: Modifier = Modifier
){
    when (image){
        is ImageHandler.ResourceImage -> {
            Image(
                painter = painterResource(image.resourceId),
                contentDescription = stringResource(R.string.game_image_desc),
                contentScale = contentScale,
                modifier = modifier
            )
        }

        is ImageHandler.UrlImage -> {
            // Implement AsyncImage()
        }
    }
}