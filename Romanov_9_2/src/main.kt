import Dispatcher.*
import kotlin.random.Random

fun main()
{
    var seed : Int = Random.nextInt()


    var TripArray : Array<Trips> = Array(10) {Trips(0,0,0)}
    TripArray = TripArray[0].GenerateTrips(Random(seed))

    var DriverArray : Array<Drivers> = Array(10) {Drivers(0,0,0)}


    for (i in 0..9)
    {
        DriverArray[i] = DriverArray[i].GenerateDriver(Random(seed),TripArray, i)

    }

    var CarArray : Array<Cars> = Array(10) {Cars(0,"")}

    CarArray[0].SelectCarModels(CarArray)

    for (i in 0..9)
    {
        CarArray[i] = CarArray[i].GenerateCar(Random(seed),DriverArray,i,CarArray[i].carModel)
    }

    for (i in 0..9)
    {
        var randomEvent : Int = Random.nextInt(0,3)
        TripArray[i].InfoAll(TripArray,DriverArray,CarArray,i)
        when (randomEvent)
        {
            0 ->
            {
                println("Рейс успешно закончен. Водитель подал заявку на ремонт.")
            }
            1 ->
            {
                println("Рейс отменен. Водитель был отстранен.")
            }
            2 ->
            {
                println("Рейс успешно закончен. Машина не нуждается в ремонте")
            }
        }
        println()
    }
}

