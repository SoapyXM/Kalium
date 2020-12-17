package dev.soapy.kalium.circuit.primitives

import circuit.Circuit
import dev.soapy.kalium.state.PinState
import dev.soapy.kalium.wiring.Pin
import dev.soapy.kalium.wiring.PinType

class NandCircuit : Circuit("AND") {
    val inputA = Pin(this, "A", PinType.Input)
    val inputB = Pin(this, "B", PinType.Input)

    val output = Pin(this, "Output", PinType.Output)

    init {
        pins.add(inputA)
        pins.add(inputB)
        pins.add(output)
    }

    override fun update() {
        super.update()
        output.state = PinState.fromBool(!(inputA.state.asBool() && inputB.state.asBool()))
        scheduledPropagations.put(output, 1)
    }
}