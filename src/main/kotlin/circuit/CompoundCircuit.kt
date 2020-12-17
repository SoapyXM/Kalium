package dev.soapy.kalium.circuit

import circuit.Circuit

class CompoundCircuit(name: String) : Circuit(name) {
    val subCircuits: MutableList<Circuit> = mutableListOf()
}