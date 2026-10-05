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
public val corporate_fare: ImageVector
  get() {
    if (_corporate_fare != null) {
      return _corporate_fare!!
    }
    _corporate_fare =
      ImageVector.Builder(
          name = "corporate_fare",
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
            moveTo(2f, 21f)
            verticalLineTo(3f)
            horizontalLineTo(12f)
            verticalLineTo(7f)
            horizontalLineTo(22f)
            verticalLineTo(21f)
            horizontalLineTo(2f)
            close()
            moveTo(4f, 19f)
            horizontalLineToRelative(6f)
            verticalLineTo(17f)
            horizontalLineTo(4f)
            verticalLineToRelative(2f)
            close()
            moveTo(4f, 15f)
            horizontalLineToRelative(6f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineToRelative(2f)
            close()
            moveTo(4f, 11f)
            horizontalLineToRelative(6f)
            verticalLineTo(9f)
            horizontalLineTo(4f)
            verticalLineToRelative(2f)
            close()
            moveTo(4f, 7f)
            horizontalLineToRelative(6f)
            verticalLineTo(5f)
            horizontalLineTo(4f)
            verticalLineTo(7f)
            close()
            moveToRelative(8f, 12f)
            horizontalLineToRelative(8f)
            verticalLineTo(9f)
            horizontalLineTo(12f)
            verticalLineTo(19f)
            close()
            moveToRelative(2f, -6f)
            verticalLineTo(11f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            horizontalLineTo(14f)
            close()
            moveToRelative(0f, 4f)
            verticalLineTo(15f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            horizontalLineTo(14f)
            close()
          }
        }
        .build()
    return _corporate_fare!!
  }

private var _corporate_fare: ImageVector? = null
