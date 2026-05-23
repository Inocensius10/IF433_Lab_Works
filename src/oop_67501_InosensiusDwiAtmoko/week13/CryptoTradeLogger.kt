package oop_67501_InosensiusDwiAtmoko.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {

    return try {

        val parts = line.split(",")

        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )

    } catch (e: Exception) {

        println("(Log) Data korup diabaikan: $line")

        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {

    File(path).printWriter().use { writer ->

        trades.forEach {
            writer.println(it.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {

    return try {

        File(path)
            .readLines()
            .mapNotNull {
                fromCsvTrade(it)
            }

    } catch (e: FileNotFoundException) {

        println("File tidak ditemukan!")

        emptyList()
    }
}

fun main() {

    val trades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1000.0, 250.5),
        TradeRecord(2, "ETHUSDT", "Short", 800.0, -120.0),
        TradeRecord(3, "SOLUSDT", "Long", 500.0, 90.0)
    )

    val loadedData = loadTrades("crypto_trades.csv")

    val totalPnl = loadedData.sumOf { it.pnl }

    saveTrades(trades, "crypto_trades.csv")

    File("crypto_trades.csv")
        .appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
}

