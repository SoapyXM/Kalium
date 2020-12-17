package dev.soapy.kalium

import dev.soapy.kalium.circuit.primitives.NandCircuit
import dev.soapy.kalium.state.PinState

fun main() {
    val nand1 = NandCircuit()

    nand1.inputA.state = PinState.High
    nand1.inputB.state = PinState.High
}