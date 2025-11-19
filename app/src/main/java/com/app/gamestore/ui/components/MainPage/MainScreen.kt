package com.app.gamestore.ui.components.MainPage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.app.gamestore.R
import com.app.gamestore.enums.NavbarOptions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Column(
                        //modifier = Modifier
                        //.padding(innerPadding)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(25.dp, Alignment.End),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 20.dp, vertical = 10.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Notifications,
                                contentDescription = stringResource(R.string.notifications_icon_desc)
                            )
                            Icon(
                                imageVector = Icons.Outlined.Settings,
                                contentDescription = stringResource(R.string.settings_icon_desc)
                            )
                        }
                    }
                }
            )
        },
        bottomBar = {
            val navController = rememberNavController()
            val initialOption = NavbarOptions.FEATURED
            var selectedOption = NavbarOptions.entries.indexOf(initialOption)

            NavigationBar(windowInsets = NavigationBarDefaults.windowInsets) {
                NavbarOptions.entries.forEachIndexed { index, option ->
                    NavigationBarItem(
                        selected = selectedOption == index,
                        onClick = {
                            navController.navigate(route = option.route)
                            selectedOption = index
                        },
                        icon = {
                            Icon(
                                option.icon,
                                contentDescription = option.contentDescription
                            )
                        },
                        label = { Text(option.label) }
                    )
                }
            }
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            // Company Name
            Row(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = stringResource(R.string.company_name),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(5.dp),
                modifier = Modifier
                    .padding(top = 10.dp)
            ) {
                // Card 1
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFBD8F05),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(200.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Game 1",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .padding(16.dp)
                                .align(Alignment.BottomStart),
                            textAlign = TextAlign.Center,
                        )
                    }
                }

                // Card 2
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFBD8F05),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(200.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Game 2",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .padding(16.dp)
                                .align(Alignment.BottomStart),
                            textAlign = TextAlign.Center,
                        )
                    }
                }

                // Card 3
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFBD8F05),
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(200.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Text(
                            text = "Game 3",
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
        }

    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}