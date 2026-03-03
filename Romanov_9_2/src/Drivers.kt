package Dispatcher

import kotlin.random.Random

class Drivers constructor(val tripNum : Int, val carNum : Int, val driverNum : Int) : Dispatcher() {
    fun Info()
    {
        println("Номер рейса: $tripNum, номер машины: $carNum, номер водителя: $driverNum")
    }

    fun Repair()
    {
        
    }

    fun GenerateDriver(random: Random, TripArray: Array<Trips>, i : Int) : Drivers // Генерация водителя
    {
        val driver : Drivers = Drivers(TripArray[i].tripNum, random.nextInt(0,100), random.nextInt(0,100))
        return driver
    }
}