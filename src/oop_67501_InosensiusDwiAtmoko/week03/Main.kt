package oop_67501_InosensiusDwiAtmoko.week03

fun main() {

    val e = Employee("Budi")

    // 1. Test Salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5   // harus error kalau dicoba

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}