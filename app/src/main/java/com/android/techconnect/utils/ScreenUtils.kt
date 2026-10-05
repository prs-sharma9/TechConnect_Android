package com.android.techconnect.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object ScreenUtils {
    private val COMPACT_MAX = 600.dp
    private val MEDIUM_MAX = 840.dp

    enum class WindowSize {
        COMPACT, MEDIUM, EXPANDED
    }

    @Composable
    fun getWindowSize(): WindowSize {
        val windowSize = LocalConfiguration.current.screenWidthDp.dp
        return when {
            windowSize < COMPACT_MAX -> WindowSize.COMPACT
            windowSize < MEDIUM_MAX -> WindowSize.MEDIUM
            else -> WindowSize.EXPANDED
        }
    }

    @Composable
    fun getCardWidth(): Dp {
        return when(getWindowSize()) {
            WindowSize.COMPACT -> LocalConfiguration.current.screenWidthDp.dp
            WindowSize.MEDIUM -> 500.dp
            WindowSize.EXPANDED -> 600.dp
        }
    }
}