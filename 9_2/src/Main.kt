import Dispatcher.*
import kotlin.random.Random
import Passenger.*

fun main()
{
    try {


        var seed: Int = Random.nextInt() //семя для генерации случайных чисел


        var TripArray: Array<Trips> = Array(10) { Trips(0, 0, 0) }
        TripArray = TripArray[0].GenerateTrips(Random(seed))

        var DriverArray: Array<Drivers> = Array(10) { Drivers(0, 0, 0, 0.0) }


        for (i in 0..9) {
            DriverArray[i] = DriverArray[i].GenerateDriver(Random(seed), TripArray, i)

        }

        var CarArray: Array<Cars> = Array(10) { Cars(0, "") }
        CarArray[0].SelectCarModels(CarArray)

        for (i in 0..9) {
            CarArray[i] = CarArray[i].GenerateCar(Random(seed), DriverArray, i, CarArray[i].carModel)
        }

        for (i in 0..9) {
            var randomEvent: Int = Random.nextInt(0, 3)
            TripArray[i].InfoAll(TripArray, DriverArray, CarArray, i)
            println("Цена рейса: ${TripArray[i].CostCalculate(DriverArray[i], Random.nextDouble(0.0, 2000.0))}")
            when (randomEvent) {
                0 -> {
                    println("Рейс успешно закончен. Водитель подал заявку на ремонт.")
                }

                1 -> {
                    println("Рейс отменен. Водитель был отстранен.")
                }

                2 -> {
                    println("Рейс успешно закончен. Машина не нуждается в ремонте")
                }
            }
            println()
        }


        var passenger: Passenger = Passenger("", 0, 0)

        println("Введите уровень пропуска от 0 до 2")
        var pass: Int = readln().toInt()
        println("Введите Имя")
        passenger.name = readln()
        println("Введите Деньги")
        passenger.money = readln().toInt()

        passenger.SetPass(pass)

        passenger.Info()

    }
    catch (e: NumberFormatException)
    {
        println("Неверный тип данных")
    }


}