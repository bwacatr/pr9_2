package Dispatcher

import kotlin.random.Random

class Trips constructor(val application : Int, val tripNum : Int, var clientNum : Int) : Dispatcher()
{
    fun Info()
    {
        println("Заявка на рейс: $application, номер рейса: $tripNum, номер клиента: $clientNum")
    }

    fun GenerateTrips(random: Random) : Array<Trips> // Генерация массива рейсов
    {
        val TripArray : Array<Trips> = Array(10) {Trips(random.nextInt(0,1000), random.nextInt(0,100),random.nextInt(0,100))}

        return TripArray
    }

}