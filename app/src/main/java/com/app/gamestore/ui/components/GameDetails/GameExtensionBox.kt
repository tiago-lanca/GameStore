package com.app.gamestore.ui.components.GameDetails

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.gamestore.R
import com.app.gamestore.models.GameExtension
import com.app.gamestore.samples.GameSamples
import com.app.gamestore.ui.components.GameImageView

@Composable
fun GameExtensionBox(
    extension: GameExtension,
    onGameExtensionClick: (GameExtension) -> Unit
){
    Row(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp)
            .clickable { onGameExtensionClick(extension) }
    ) {

        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .size(140.dp)
        ) {
                GameImageView(
                    image = extension.image,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )

        }

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .weight(1f)
        ) {
            // Name of Extension / DLC
            Text(
                text = extension.name,
                textAlign = TextAlign.Start,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )

            // Description of Extension / DLC
            Text(
                text = extension.description,
                textAlign = TextAlign.Start,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = Color.DarkGray
            )

            // Price
            Text(
                text = "$${extension.price}",
                textAlign = TextAlign.End,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview
@Composable
fun GameExtensionBoxPreview(){
    GameExtensionBox(
        extension = GameSamples.createGameExtension(),
        onGameExtensionClick = {}
    )
}