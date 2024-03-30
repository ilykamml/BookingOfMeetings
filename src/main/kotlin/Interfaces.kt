package ru.ilyamnl

interface RoomManager {
    fun addRoom()

    fun delRoom()

    fun findRoom()
}

interface BookingManager {

    fun createBooking()

    fun cancelBooking()

    fun findBooking()

    fun checkRoomOccupancy()

}

interface StockManager {

    fun addEquipment()

    fun delEquipment()

    fun findByType()

    fun findByName()

    fun giveEquipToRoom()

    fun pickUpEquipFromRoom()

}

interface Recorder {

    fun writeToFile()

    fun loadFromFile()

}