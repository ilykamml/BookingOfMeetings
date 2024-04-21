import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ru.ilyamnl.BookingManager
import ru.ilyamnl.BookingManagerImpl
import ru.ilyamnl.Equipment
import ru.ilyamnl.Room
import java.time.LocalDateTime

class BookingManagerImplTest {

    private val bookingManager: BookingManager = BookingManagerImpl()
    private val firstRoom = Room("abc", "meeting room", 12, mutableListOf<Equipment>())
    private val secondRoom = Room("cba", "silent room", 2, mutableListOf<Equipment>())

    @Test
    fun `simple check room occupancy`() {
        bookingManager.createBooking(firstRoom, "Alex", LocalDateTime.now(), LocalDateTime.now().plusHours(2))
        Assertions.assertEquals(true,
            bookingManager.checkRoomOccupancy(
                "abc",
                LocalDateTime.now().plusMinutes(5),
                LocalDateTime.now().plusHours(1)))
    }


}