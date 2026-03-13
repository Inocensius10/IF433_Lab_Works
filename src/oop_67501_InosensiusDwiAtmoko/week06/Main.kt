package oop_67501_InosensiusDwiAtmoko.week06

// Fungsi Decoupled
fun processCheckout(method: PaymentMethod, amount: Double) {

    println("--> Memulai checkout...")
    method.pay(amount)

}

fun main() {

    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    val lamp = SmartLamp("L1", "Ruang Tamu")
    val speaker = SmartSpeaker("S1", "Google Nest Dapur")
    val cctv = SmartCCTV("C1", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

    println("\n=== TESTING CHECKOUT ===")

    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

}