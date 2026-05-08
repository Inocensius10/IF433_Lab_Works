package oop_67501_InosensiusDwiAtmoko.week10

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(query: String): List<T> {
        return items.filter {
            it is NamedEntity &&
                    it.name.contains(query, ignoreCase = true)
        }
    }
}