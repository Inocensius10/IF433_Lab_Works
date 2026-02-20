package oop_67501_InosensiusDwiAtmoko.week03

class Employee(val name: String) {

    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value   // SALAH (recursive)
        }
}