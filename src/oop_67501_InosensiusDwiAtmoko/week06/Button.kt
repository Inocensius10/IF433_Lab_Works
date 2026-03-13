package oop_67501_InosensiusDwiAtmoko.week06

class Button(override val name: String) : Clickable {

    override fun click() {
        println("Tombol $name berhasil diklik!")
    }

}