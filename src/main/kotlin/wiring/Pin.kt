package dev.soapy.kalium.wiring

import circuit.Circuit
import dev.soapy.kalium.state.PinState

/**
 * A single digital pin for a circuit.
 */
class Pin(parent: Circuit, name: String, type: PinType) {
    val connections: MutableList<Pin> = mutableListOf()

    var state: PinState = PinState.Floating

    fun propagate() {

    }

    fun connect(other: Pin) {
        connections.add(other)
        other.connections.add(this)
    }
}