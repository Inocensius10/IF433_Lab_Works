package oop_67501_InosensiusDwiAtmoko.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}