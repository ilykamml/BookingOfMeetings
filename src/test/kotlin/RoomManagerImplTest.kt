import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ru.ilyamnl.Room
import ru.ilyamnl.RoomManagerImpl

class RoomManagerImplTest {

    private val roomManager = RoomManagerImpl()

    @Test
    fun `simple create room check`() {
        roomManager.addRoom("12", "Dining room", 20, mutableListOf())
        Assertions.assertEquals(
            listOf(Room("12", "Dining room", 20, mutableListOf())),
            roomManager.getAllRooms())
    }

    @Test
    fun `add room with same id`() {
        roomManager.addRoom("12", "Dining room", 20, mutableListOf())
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            roomManager.addRoom("12", "Laboratory", 5, mutableListOf())
        }
    }

    @Test
    fun `simple remove room check`() {
        roomManager.addRoom("12", "Dining room", 20, mutableListOf())
        roomManager.delRoom("12")
        Assertions.assertEquals(
            listOf<Room>(),
            roomManager.getAllRooms())
    }

    @Test
    fun `find existing room check`() {
        roomManager.addRoom("12", "Dining room", 20, mutableListOf())
        Assertions.assertEquals(Room("12", "Dining room", 20, mutableListOf()), roomManager.findRoom("12"))
    }

    @Test
    fun `find not existing room check`() {
        roomManager.addRoom("12", "Dining room", 20, mutableListOf())
        Assertions.assertEquals(null, roomManager.findRoom("10"))
    }

}