package oop_67501_InosensiusDwiAtmoko.week05

class EWallet(

    accountName: String,
    var balance: Double

) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil menggunakan EWallet oleh $accountName")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup untuk pembayaran sebesar $amount")
        }

    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }

}