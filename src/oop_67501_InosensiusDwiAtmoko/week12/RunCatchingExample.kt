package oop_67501_InosensiusDwiAtmoko.week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    println("Result mentah: $result")

    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { value ->
        println("Berhasil dikonversi: $value")
    }.onFailure { error ->
        println("Gagal konversi: ${error.message}")
    }

    runCatching {
        "100A".toInt()
    }.onSuccess { value ->
        println("Berhasil dikonversi: $value")
    }.onFailure { error ->
        println("Gagal konversi: ${error.message}")
    }
}