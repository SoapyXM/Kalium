package circuit

import dev.soapy.kalium.wiring.Pin

/**
 * Stores and collects internal state.
 */
open class Circuit(name: String) {
    val pins: MutableList<Pin> = mutableListOf()

    val scheduledPropagations: MutableMap<Pin, Int> = mutableMapOf()

    open fun update() {
        for(entry in scheduledPropagations) {
            scheduledPropagations[entry.key] = entry.value - 1
            if(entry.value == 1)
                entry.key.propagate()
        }
    }
}