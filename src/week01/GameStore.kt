package week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 750000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println("Harga Akhir: $finalPrice")

    println("Judul Game: $gameTitle")
    println("Harga Asli: $price")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) price * 20 / 100 else price * 10 / 100
