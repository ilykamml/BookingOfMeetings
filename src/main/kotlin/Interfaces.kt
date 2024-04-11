package ru.ilyamnl

interface RoomManager {

    fun addRoom(room: Room)

    fun delRoom(room: Room)

    fun findRoom(roomId: String): Room?

}

interface BookingManager {

    fun createBooking()

    fun cancelBooking()

    fun findBooking()

    fun checkRoomOccupancy()

}

interface StockManager {

    fun addEquipment(equipment: Equipment)

    fun delEquipment(equipment: Equipment)

    fun findByType(type: EquipmentType): Equipment?

    fun findByName(name: String): Equipment?

    fun giveEquipToRoom(room: Room, equipment: Equipment)

    fun pickUpEquipFromRoom(room: Room, equipment: Equipment)

}

interface Recorder {

    fun writeToFile()

    fun loadFromFile()

}