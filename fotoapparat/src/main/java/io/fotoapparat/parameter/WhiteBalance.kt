package io.fotoapparat.parameter

sealed class WhiteBalance : Parameter {
    object Auto : WhiteBalance() {
        override fun toString(): String = "WhiteBalance.Auto"
    }
    
    
    object Daylight : WhiteBalance() {
        override fun toString(): String = "WhiteBalance.Daylight"
    }

    object CloudyDaylight: WhiteBalance() {
        override fun toString(): String = "WhiteBalance.CloudyDaylight"
    }

    object Fluorescent : WhiteBalance() {
        override fun toString(): String = "WhiteBalance.Fluorescent"
    }

    object Incandescent : WhiteBalance() {
        override fun toString(): String = "WhiteBalance.Incandescent"
    }

    object Shade : WhiteBalance() {
        override fun toString(): String = "WhiteBalance.Shade"
    }

    object Twilight : WhiteBalance() {
        override fun toString(): String = "WhiteBalance.Twilight"
    }

    object WarmFluorescent : WhiteBalance() {
        override fun toString(): String = "WhiteBalance.WarmFluorescent"
    }
}