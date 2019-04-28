package io.fotoapparat.selector

import io.fotoapparat.parameter.WhiteBalance

typealias  WhiteBalanceSelector = Iterable<WhiteBalance>.() -> WhiteBalance?

fun autoWhiteBalance(): WhiteBalanceSelector = single(WhiteBalance.Auto)

fun daylight(): WhiteBalanceSelector = single(WhiteBalance.Daylight)

fun twilight(): WhiteBalanceSelector = single(WhiteBalance.Twilight)
fun fluorescent(): WhiteBalanceSelector = single(WhiteBalance.Fluorescent)
fun shade(): WhiteBalanceSelector = single(WhiteBalance.Shade)
fun warmFluorescent(): WhiteBalanceSelector = single(WhiteBalance.WarmFluorescent)
fun cloudyDaylight(): WhiteBalanceSelector = single(WhiteBalance.CloudyDaylight)

fun incandescent(): WhiteBalanceSelector = single(WhiteBalance.Incandescent)


fun manualWhiteBalance(whiteBalance: WhiteBalance): WhiteBalanceSelector = single(whiteBalance)














