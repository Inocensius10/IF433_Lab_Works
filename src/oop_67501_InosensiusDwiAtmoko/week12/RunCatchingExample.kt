package oop_67501_InosensiusDwiAtmoko.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    println("Result mentah: $result")
}