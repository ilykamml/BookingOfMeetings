package ru.ilyamnl

import java.time.LocalDateTime

fun main() {

    val table = Equipment(1233, "Small table", EquipmentType.TABLE)
    val chair1 = Equipment(323, "Chair with wheels", EquipmentType.CHAIR)
    val chair2 = Equipment(324, "Chair with wheels", EquipmentType.CHAIR)
    val room = Room("2", "Conference Room", 10, mutableListOf(table, chair1, chair2))
    val booking = Booking(123, room, "Bob", LocalDateTime.now(), LocalDateTime.now().plusHours(4))
    println(booking)
    println(room)

}