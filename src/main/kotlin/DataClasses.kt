package ru.ilyamnl

import java.time.LocalDateTime

data class Room(
    val roomID: Int,
    val roomName: String,
    val roomCapacity: Int,
    val roomEquipList: List<Equipment>
)

data class Booking(
    val bookingID: Int,
    val bookingRoomID: Int,
    val bookingEmployeeName: String,
    val bookingStartTime: LocalDateTime,
    val bookingEndTime: LocalDateTime
) {
    constructor(
        bookingID: Int,
        bookingRoomID: Room,
        bookingEmployeeName: String,
        bookingStartTime: LocalDateTime,
        bookingEndTime: LocalDateTime
    ) : this(
        bookingID,
        bookingRoomID.roomID,
        bookingEmployeeName,
        bookingStartTime,
        bookingEndTime
    )
}

data class Equipment(
    val equipID: Int,
    val equipName: String,
    val equipType: EquipmentType
)

fun main() {

    val table = Equipment(1233, "Small table", EquipmentType.TABLE)
    val chair1 = Equipment(323, "Chair with wheels", EquipmentType.CHAIR)
    val chair2 = Equipment(324, "Chair with wheels", EquipmentType.CHAIR)
    val room = Room(1, "Conference Room", 10, listOf(table, chair1, chair2))
    val booking = Booking(123, room, "Bob", LocalDateTime.now(), LocalDateTime.now().plusHours(4))
    println(booking)
    println(room)

}