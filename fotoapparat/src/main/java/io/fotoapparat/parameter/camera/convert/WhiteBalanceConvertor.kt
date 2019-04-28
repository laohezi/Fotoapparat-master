package io.fotoapparat.parameter.camera.convert

import android.hardware.Camera
import io.fotoapparat.parameter.FocusMode
import io.fotoapparat.parameter.WhiteBalance

internal fun String.toWhiteBalance(): WhiteBalance? =
        when (this) {
            Camera.Parameters.WHITE_BALANCE_AUTO -> WhiteBalance.Auto
            Camera.Parameters.WHITE_BALANCE_DAYLIGHT -> WhiteBalance.Daylight
            Camera.Parameters.WHITE_BALANCE_CLOUDY_DAYLIGHT -> WhiteBalance.CloudyDaylight
            Camera.Parameters.WHITE_BALANCE_FLUORESCENT -> WhiteBalance.Fluorescent
            Camera.Parameters.WHITE_BALANCE_INCANDESCENT -> WhiteBalance.Incandescent
            Camera.Parameters.WHITE_BALANCE_SHADE -> WhiteBalance.Shade
            Camera.Parameters.WHITE_BALANCE_TWILIGHT -> WhiteBalance.Twilight
            Camera.Parameters.WHITE_BALANCE_WARM_FLUORESCENT -> WhiteBalance.WarmFluorescent
            else -> null
        }

/**
 * Maps between [WhiteBalance] and Camera v1 WhiteBalance codes.
 *
 * @receiver WhiteBalance mode.
 * @return code of the WhiteBalance mode as in [Camera.Parameters].
 */
internal fun WhiteBalance.toCode(): String =
        when (this) {

            WhiteBalance.Auto -> Camera.Parameters.WHITE_BALANCE_AUTO
            WhiteBalance.Daylight -> Camera.Parameters.WHITE_BALANCE_DAYLIGHT
            WhiteBalance.CloudyDaylight -> Camera.Parameters.WHITE_BALANCE_CLOUDY_DAYLIGHT
            WhiteBalance.Fluorescent -> Camera.Parameters.WHITE_BALANCE_FLUORESCENT
            WhiteBalance.Incandescent -> Camera.Parameters.WHITE_BALANCE_INCANDESCENT
            WhiteBalance.Shade -> Camera.Parameters.WHITE_BALANCE_SHADE
            WhiteBalance.Twilight -> Camera.Parameters.WHITE_BALANCE_TWILIGHT
            WhiteBalance.WarmFluorescent -> Camera.Parameters.WHITE_BALANCE_WARM_FLUORESCENT
        }