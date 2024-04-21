package ru.ilyamnl

import java.time.LocalDateTime

interface BookingManager {

    fun createBooking(room: Room, employeeName: String, startTime: LocalDateTime, endTime: LocalDateTime)

    fun cancelBooking(bookingId: Int)

    fun findBooking(bookingId: Int): Booking?

    fun checkRoomOccupancy(roomID: String, startTime: LocalDateTime, endTime: LocalDateTime): Boolean

}