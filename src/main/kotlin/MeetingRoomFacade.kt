package ru.ilyamnl

import java.time.LocalDateTime


//MeetingRoomFacade (Фасад для управления переговорками)
    //Атрибуты:
        //RoomManager
        //BookingManager
        //StockManager
    //Методы:
        //Конструктор, принимающий реализации вышеупомянутых интерфейсов.
        //Общий интерфейс для управления комнатами, бронированиями и оборудованием:
            //Добавить оборудование на баланс
            //Удалить оборудование с баланса
            //Переместить оборудование в комнату
            //Найти свободную комнату в указанный период, вмещающую нужное количество людей и имеющую нужное оборудование
            //Забронировать комнату в диапазон времени
            //Снять бронирование комнаты


class MeetingRoomFacade(
    private val roomManager: RoomManager,
    private val bookingManager: BookingManager,
    private val stockManager: StockManager) {

    private val rooms = mutableListOf<Room>()
    private val bookings = mutableListOf<Booking>()
    private val equipment = mutableListOf<Equipment>()

    fun addEquipmentOnBalance(equipment: Equipment) {

    }

    fun delEquipmentFromBalance(equipment: Equipment) {

    }

    fun transferEquipmentToRoom(equipment: Equipment, room: Room) {

    }

    fun findBestRoom(
        startTime: LocalDateTime,
        endTime: LocalDateTime,
        humanAmount: Int,
        equipments: List<Equipment>): Room? {

        return null

    }

    fun bookARoom(startTime: LocalDateTime, endTime: LocalDateTime, room: Room) {

    }

    fun cancelBooking(booking: Booking) {

    }

}