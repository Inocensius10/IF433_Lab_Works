package oop_67501_InosensiusDwiAtmoko.week03

fun main() {

    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n--- TEST WEAPON ---")

    val sword = Weapon("Excalibur")

    sword.damage = -50
    println("Damage sekarang: ${sword.damage}")

    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}")
    println("Tier: ${sword.tier}")

    println("\n--- TEST PLAYER ---")

    val player = Player("Ino")

// player.xp = 1000  // harus error kalau dicoba

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}