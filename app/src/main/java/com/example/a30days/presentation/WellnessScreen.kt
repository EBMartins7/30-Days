package com.example.a30days.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30days.R
import com.example.a30days.data.DataSource
import com.example.a30days.model.WellnessTip
import com.example.a30days.ui.theme._30DaysTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WellnessScreen() {
    Scaffold(
        topBar = {
            TopAppBar()
        }
    ) {
        val tipsList = DataSource().loadWellnessTips()
        WellnessTipList(tips = tipsList, contentPadding = it)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    TopAppBar(title = {
        Text(
            text = "30 Days of Wellness",
            style = MaterialTheme.typography.displayLarge
        )
    })
}

@Composable
fun WellnessCard(
    tip: WellnessTip,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clip(RoundedCornerShape(16.dp)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(id = tip.day))
            Text(
                text = stringResource(id = tip.tip),
                style = TextStyle(
                    fontSize = 22.sp
                )
            )
            Box(modifier = Modifier.padding(horizontal = 44.dp, vertical = 4.dp)) {
                Image(
                    painter = painterResource(id = tip.image),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    contentScale = ContentScale.FillWidth
                )
            }
            Text(text = stringResource(id = tip.instruction))
        }
    }
}

@Composable
fun WellnessTipList(
    tips: List<WellnessTip>,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(contentPadding = contentPadding) {
            items(tips) { tip ->
                WellnessCard(
                    tip = tip,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessScreenPreview() {
    _30DaysTheme {
        WellnessScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessTipListPreview() {
    _30DaysTheme {
        WellnessTipList(tips = DataSource().loadWellnessTips())
    }
}


@Preview(showBackground = true)
@Composable
fun WellnessCardPreview() {
    WellnessCard(
        tip = WellnessTip(
            R.string.day1, R.string.tip1, R.string.instruction1, R.drawable.image1
        )
    )
}
