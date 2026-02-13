package week02

class LibraryLoan(
    val bookTitle: String,
    val daysLate: Int
) {

    fun calculateFine(): Int {
        val finePerDay = 2000
        return daysLate * finePerDay
    }
}
