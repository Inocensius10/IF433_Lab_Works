package oop_67501_InosensiusDwiAtmoko.week05

abstract class PaymentMethod(

    val accountName: String

) {

    abstract fun processPayment(amount: Double)

}