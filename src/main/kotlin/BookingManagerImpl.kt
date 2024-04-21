package ru.ilyamnl

import java.time.LocalDateTime

class BookingManagerImpl : BookingManager {

    private val bookings = mutableListOf<Booking>()

    private var lastID = 0

    override fun createBooking(room: Room, employeeName: String, startTime: LocalDateTime, endTime: LocalDateTime) {
        bookings.add(Booking(lastID++, room.roomID, employeeName, startTime, endTime))
    }

    override fun cancelBooking(bookingId: Int) {
        bookings.removeIf { it.bookingID == bookingId }
    }

    override fun findBooking(bookingId: Int): Booking? {
        return bookings.find { it.bookingID == bookingId }
    }

    override fun checkRoomOccupancy(roomID: String, startTime: LocalDateTime, endTime: LocalDateTime): Boolean {
        bookings.filter { it.bookingRoomID == roomID }.forEach { book ->
            if (
                startTime.isBefore(book.bookingEndTime) && startTime.isAfter(book.bookingStartTime)
                || endTime.isBefore(book.bookingEndTime) && endTime.isAfter(book.bookingStartTime)
                || startTime.isBefore(book.bookingStartTime) && endTime.isAfter(book.bookingEndTime)
            ) {
                return true
            }
        }
        return false
    }

}
