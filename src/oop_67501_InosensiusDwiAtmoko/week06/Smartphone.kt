package oop_67501_InosensiusDwiAtmoko.week06

class Smartphone : Camera, Phone {

    override fun turnOn() {

        super<Camera>.turnOn()   // logika Camera
        super<Phone>.turnOn()    // logika Phone

        println("Sistem operasi Smartphone berhasil booting.")
    }

}