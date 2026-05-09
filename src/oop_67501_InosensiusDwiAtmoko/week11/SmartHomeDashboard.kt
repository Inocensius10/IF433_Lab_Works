package oop_67501_InosensiusDwiAtmoko.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    val lampu = SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }

    homeDevices.add(lampu)
}