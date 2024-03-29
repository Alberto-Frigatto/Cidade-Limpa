package com.cidadelimpa.components.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.cidadelimpa.R
import com.cidadelimpa.components.form.SearchBar
import com.cidadelimpa.components.layout.ColumnCenter
import com.cidadelimpa.components.layout.Footer
import com.cidadelimpa.ui.theme.DarkBlue
import com.cidadelimpa.ui.theme.ExtraLightGrey
import com.cidadelimpa.ui.theme.MediumGrey
import com.cidadelimpa.ui.theme.roboto_bold
import com.cidadelimpa.ui.theme.roboto_regular

@Composable
fun HomePage(navController: NavController)
{
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.trash_deselected_map),
            contentDescription = "Mapa",
            modifier = Modifier.fillMaxSize()
        )

        Column(modifier = Modifier
            .border(1.dp, MediumGrey)
            .fillMaxWidth()
            .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(bottom = 20.dp, top = 4.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SearchBar()
                Text(
                    text = "Abaixo está localização das lixeiras",
                    fontFamily = roboto_bold
                )
            }
        }

        Footer(
            modifier = Modifier
                .border(1.dp, MediumGrey)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(0.dp)
                .background(Color.White),
            navController = navController,
            activeBtnId = 1
        )
    }
}