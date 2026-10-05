package com.android.techconnect.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.mandatorySystemGesturesPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.android.techconnect.R
import com.android.techconnect.icons.corporate_fare
import com.android.techconnect.icons.group
import com.android.techconnect.icons.handshake
import com.android.techconnect.icons.trophy
import com.android.techconnect.utils.ScreenUtils

@Composable
fun ResultSection() {
    val screenSize = ScreenUtils.getWindowSize()

    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.result_section_heading),
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentAlignment = Alignment.Center
            ) {
                when (screenSize) {
                    ScreenUtils.WindowSize.COMPACT, ScreenUtils.WindowSize.MEDIUM -> {
                        LazyColumn() {
                            items( items = RESULTS_LIST) {
                                ResultCard(
                                    icon = it.icon,
                                    iconDescription = it.iconDescriptor,
                                    heading = it.heading,
                                    subHeading = it.subHeading,
                                    content = it.content
                                )
                            }
                        }
                    }
                    else -> {
                        LazyRow() {
                            items(items = RESULTS_LIST) {
                                ResultCard(
                                    icon = it.icon,
                                    iconDescription = it.iconDescriptor,
                                    heading = it.heading,
                                    subHeading = it.subHeading,
                                    content = it.content
                                )
                            }
                        }
                    }
                }
            }
        }

    }


}


private val RESULTS_LIST = listOf(
    ResultCardObject(
        icon = group,
        iconDescriptor = R.string.community_member_icon_description,
        heading = "5000+",
        subHeading = "Active Community Members",
        content = "Tech professionals, job seekers, and entrepreneurs collaborating daily"
    ),
    ResultCardObject(
        icon = corporate_fare,
        iconDescriptor = R.string.member_across_company_icon_description,
        heading = "500+",
        subHeading = "Members Across Companies",
        content = "Referral network spanning across leading tech organizations"
    ),
    ResultCardObject(
        icon = handshake,
        iconDescriptor = R.string.partner_icon_description,
        heading = "10+",
        subHeading = "Partner Companies",
        content = "Strategic partnerships with industry-leading organizations"
    ),
    ResultCardObject(
        icon = trophy,
        iconDescriptor = R.string.success_stories_icon_description,
        heading = "200+",
        subHeading = "Success Stories",
        content = "Individuals successfully placed and career milestones achieved every year"
    )
)

data class ResultCardObject(
    val icon: ImageVector,
    val iconDescriptor: Int,
    val heading: String,
    val subHeading: String,
    val content: String
)