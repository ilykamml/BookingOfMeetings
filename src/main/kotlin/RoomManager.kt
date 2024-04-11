package ru.ilyamnl

interface RoomManager {

    fun addRoom(roomID: String, roomName: String, roomCapacity: Int, roomEquipList: MutableList<Equipment>)

    fun delRoom(roomID: String)

    fun findRoom(roomId: String): Room?

    fun getAllRooms(): List<Room>

}