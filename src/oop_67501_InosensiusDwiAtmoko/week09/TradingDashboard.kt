package oop_67501_InosensiusDwiAtmoko.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 5, 3.2, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 15, 7.8, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 12.1, "CLOSED"),
        TradeLog("XRPUSDT", "SHORT", 8, -2.4, "OPEN")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}