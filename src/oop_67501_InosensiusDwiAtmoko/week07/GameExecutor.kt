package oop_67501_InosensiusDwiAtmoko.week07

fun processEvent(event: BattleState) {
    val message = when (event) {

        is BattleState.MonsterEncounter ->
            "Musuh muncul: ${event.monsterName}"

        is BattleState.LootDropped ->
            "Dapat item: ${event.item.name} (${event.item.rarity})"

        is BattleState.GameOver ->
            "Game Over: ${event.reason}"

        BattleState.SafeZone ->
            "Kamu berada di zona aman"
    }

    println(message)
}