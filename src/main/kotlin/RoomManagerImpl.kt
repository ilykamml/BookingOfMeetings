package ru.ilyamnl

class RoomManagerImpl : RoomManager {

    private val rooms = mutableListOf<Room>()

    override fun addRoom(roomID: String, roomName: String, roomCapacity: Int, roomEquipList: MutableList<Equipment>) {
        if (rooms.any { it.roomID == roomID }) {
            throw IllegalArgumentException("Cannot create a room with an same roomID")
        }
        rooms.add(Room(roomID, roomName, roomCapacity, roomEquipList))
    }

    override fun delRoom(roomID: String) {
        rooms.removeIf { it.roomID == roomID }
    }

    override fun findRoom(roomId: String): Room? {
        return rooms.firstOrNull { it.roomID == roomId }
    }

    override fun getAllRooms(): List<Room> {
        return rooms.toList()
    }
}