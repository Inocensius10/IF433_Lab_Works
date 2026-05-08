package oop_67501_InosensiusDwiAtmoko.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.75))
    coinRepo.add(Coin("ETH", 12.5))
    coinRepo.add(Coin("USDT", 1500.0))
}