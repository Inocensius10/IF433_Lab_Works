package oop_67501_InosensiusDwiAtmoko.week12

class InsufficientFundsException(amount: Double, balance: Double) :
    Exception("Attempted $amount, balance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw IllegalArgumentException("Amount must be positive")
        }

        if (amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }

        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}