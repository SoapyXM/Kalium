package dev.soapy.kalium.state

import dev.soapy.kalium.FloatingPinEvaluatedException

enum class PinState {
    High, Low, Floating;

    fun asBool(): Boolean {
        if(this == Floating)
            throw FloatingPinEvaluatedException()
        else return this == High
    }

    companion object {
        fun fromBool(value: Boolean): PinState {
            return if(value) High else Low
        }
    }
}