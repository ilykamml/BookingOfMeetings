package ru.ilyamnl

data class Room(
    val roomID: String,
    val roomName: String,
    val roomCapacity: Int,
    val roomEquipList: MutableList<Equipment>
)