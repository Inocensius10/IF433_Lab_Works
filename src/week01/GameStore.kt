package week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100 else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul: $title")
    println("Harga Akhir: $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}
