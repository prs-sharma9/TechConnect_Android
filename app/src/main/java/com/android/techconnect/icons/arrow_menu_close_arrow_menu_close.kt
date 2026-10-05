package com.android.techconnect.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
public val arrow_menu_close: ImageVector
  get() {
    if (_arrow_menu_close != null) {
      return _arrow_menu_close!!
    }
    _arrow_menu_close =
      ImageVector.Builder(
          name = "arrow_menu_close",
          defaultWidth = 24.dp,
          defaultHeight = 24.dp,
          viewportWidth = 24f,
          viewportHeight = 24f,
        )
        .apply {
          path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Bevel,
            strokeLineMiter = 1f,
            pathFillType = PathFillType.Companion.NonZero,
          ) {
            moveTo(11f, 17f)
            verticalLineTo(7f)
            lineTo(6f, 12f)
            lineToRelative(5f, 5f)
            close()
            moveToRelative(2f, 4f)
            horizontalLineToRelative(2f)
            verticalLineTo(3f)
            horizontalLineTo(13f)
            verticalLineTo(21f)
            close()
          }
        }
        .build()
    return _arrow_menu_close!!
  }

private var _arrow_menu_close: ImageVector? = null
