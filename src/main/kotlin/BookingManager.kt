package ru.ilyamnl

import java.time.LocalDateTime

interface BookingManager {

    fun createBooking(room: Room, startTime: LocalDateTime, endTime: LocalDateTime)

    fun cancelBooking(bookingId: String)

    fun findBooking(bookingId: String): Booking?

    fun checkRoomOccupancy(roomID: String, startTime: LocalDateTime, endTime: LocalDateTime): Boolean

}