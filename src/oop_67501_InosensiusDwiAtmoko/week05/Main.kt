package oop_67501_InosensiusDwiAtmoko.week05

fun main() {

    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {

            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("----------------------------")
    }

    println()
    println("=== TEST MATH HELPER ===")

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")

    println()
    println("=== SISTEM PEMBAYARAN ===")

    val wallet = EWallet("Inosensius", 50000.0)
    val creditCard = CreditCard("Inosensius", 100000.0)

    val metodePembayaran: List<PaymentMethod> = listOf(wallet, creditCard)

    for (payment in metodePembayaran) {

        payment.processPayment(75000.0)

    }

    for (payment in metodePembayaran) {

        payment.processPayment(75000.0)

        if (payment is EWallet) {

            println("Saldo tidak cukup, melakukan top up otomatis...")
            payment.topUp(50000.0)

            println("Mencoba transaksi kembali...")
            payment.processPayment(75000.0)
        }

        println("----------------------")

    }
}