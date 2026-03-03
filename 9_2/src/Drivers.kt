package Dispatcher

import kotlin.random.Random

class Drivers constructor(val tripNum : Int, val carNum : Int, val driverNum : Int, val costModifier : Double) : Dispatcher() {
    fun Info()
    {
        println("Номер рейса: $tripNum, номер машины: $carNum, номер водителя: $driverNum, множитель цены: $costModifier")
    }



    fun GenerateDriver(random: Random, TripArray: Array<Trips>, i : Int) : Drivers // Генерация водителя
    {
        val driver : Drivers = Drivers(TripArray[i].tripNum, random.nextInt(0,100), random.nextInt(0,100), random.nextDouble(0.3, 2.0))
        return driver
    }
}