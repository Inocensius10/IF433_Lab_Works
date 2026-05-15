package oop_67501_InosensiusDwiAtmoko.week12

class InsufficientFundsException(amount: Double, balance: Double) :
    Exception("Attempted $amount, balance: $balance")