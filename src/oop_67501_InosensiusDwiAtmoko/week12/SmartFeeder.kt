package oop_67501_InosensiusDwiAtmoko.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        println("Sisa stok setelah pagi: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("Peringatan ke Pemilik: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan ke Pemilik: ${e.message}")
    } catch (e: Exception) {
        println("Peringatan ke Pemilik: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("=== JADWAL MAKAN SORE ===")
    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }

    println("Pipeline Smart Feeder selesai. Stok akhir: $currentKibbleStock gr")
}