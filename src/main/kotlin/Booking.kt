package ru.ilyamnl

import java.time.LocalDateTime

data class Booking(
    val bookingID: Int,
    val bookingRoomID: String,
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