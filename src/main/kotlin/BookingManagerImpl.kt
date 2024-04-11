package ru.ilyamnl

import java.time.LocalDateTime

class BookingManagerImpl : BookingManager {

    private val bookings = mutableListOf<Booking>(
        Booking(1, "2", "s", LocalDateTime.now(), LocalDateTime.now().plusHours(2))
    )

    override fun createBooking(room: Room, startTime: LocalDateTime, endTime: LocalDateTime) {
        TODO("Not yet implemented")
    }

    override fun cancelBooking(bookingId: String) {
        TODO("Not yet implemented")
    }

    override fun findBooking(bookingId: String): Booking? {
        TODO("Not yet implemented")
    }

    override fun checkRoomOccupancy(roomID: String, startTime: LocalDateTime, endTime: LocalDateTime): Boolean {
        bookings.filter { it.bookingRoomID == roomID }.forEach { book ->
            if (startTime.isBefore(book.bookingEndTime) && endTime.isBefore(book.bookingStartTime)
                || startTime.isAfter(book.bookingStartTime) && endTime.isBefore(book.bookingEndTime)
                || startTime.isBefore(book.bookingStartTime) && endTime.isAfter(book.bookingEndTime)) {
                    return true
                }
        }
        return false
    }

}

fun main() {
    val bookingManager = BookingManagerImpl()
    bookingManager.checkRoomOccupancy("2", LocalDateTime.now(), LocalDateTime.now().plusHours(2))
}