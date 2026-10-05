package com.android.techconnect.screens


import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.android.techconnect.R
import com.android.techconnect.components.LogoAppBar
import com.android.techconnect.components.PrimaryActionButton
import com.android.techconnect.components.ResultCard
import com.android.techconnect.components.ResultSection
import com.android.techconnect.components.TestimonialCard
import com.android.techconnect.components.TestimonialSection
import com.android.techconnect.exceptions.NotImplementedException
import com.android.techconnect.icons.group

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = { LogoAppBar() }
    ) { innerPadding ->
        Surface(
            modifier = modifier
                .fillMaxSize()
                .border(width = Dp.Hairline, color = Color.Black),
            color = MaterialTheme.colorScheme.tertiaryContainer
        ) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .verticalScroll(
                        state = rememberScrollState()
                    ),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IntroSection()
                ResultSection()
                TestimonialSection()
            }
        }
    }
}

@Composable
fun IntroSection() {
    Column(
        modifier = Modifier
            .padding(vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterEnd
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(vertical = 30.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start

            ) {
                Text(
                    text = stringResource(R.string.community),
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.secondary,
                    fontWeight = FontWeight.ExtraBold
                )

                Text(
                    text = stringResource(R.string.purpose),
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.secondary,
                    fontWeight = FontWeight.ExtraBold
                )

                Text(
                    text = stringResource(R.string.people),
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.secondary,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
        PrimaryActionButton(
            labelTxt = stringResource(R.string.join_tc_action_btn_label)
        ) {
            /**
             * TODO: Add on click action
             */
            throw NotImplementedException("Join Our Community Action Not Implemented")
        }
    }

}