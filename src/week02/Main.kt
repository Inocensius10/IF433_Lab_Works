package week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {

        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        }
        else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        }
        else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

    // ==============================
    // SISTEM DENDA PERPUSTAKAAN
    // ==============================

    println("\n--- SISTEM DENDA PERPUSTAKAAN ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Jumlah Hari Terlambat: ")
    val daysLate = scanner.nextInt()
    scanner.nextLine()

    val loan = LibraryLoan(bookTitle, daysLate)
    val totalFine = loan.calculateFine()

    println("Buku: ${loan.bookTitle}")
    println("Total Denda: Rp $totalFine")

    // ==============================
    // MINI RPG BATTLE SYSTEM
    // ==============================

    println("\n--- MINI RPG BATTLE ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val heroDamage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, heroDamage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\nPilih Aksi:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")

        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Enemy sekarang: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Enemy membalas!")
                hero.takeDamage(enemyDamage)
            }

        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid.")
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (hero.isAlive() && enemyHp == 0) {
        println("${hero.name} MENANG!")
    }
    else if (!hero.isAlive()) {
        println("${hero.name} KALAH...")
    }
    else {
        println("Pertarungan berakhir tanpa pemenang.")
    }
}
