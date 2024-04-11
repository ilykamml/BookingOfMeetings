package ru.ilyamnl

interface StockManager {

    fun addEquipment(equipment: Equipment)

    fun delEquipment(equipment: Equipment)

    fun findByType(type: EquipmentType): Equipment?

    fun findByName(name: String): Equipment?

    fun giveEquipToRoom(room: Room, equipment: Equipment)

    fun pickUpEquipFromRoom(room: Room, equipment: Equipment)

}