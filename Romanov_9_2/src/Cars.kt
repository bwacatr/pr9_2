package Dispatcher

import kotlin.random.Random

class Cars constructor(val carNum : Int, var carModel : String) : Dispatcher()
{
    fun Info()
    {
        println("Номер машины: $carNum, модель машины: $carModel")
    }

    fun SelectCarModels(CarArray : Array<Cars>)
    {
        println("Введите модели 10 машин")
        for (i in 0..9)
        {
            CarArray[i].carModel = readln()
        }
    }

    fun GenerateCar(random: Random, DriverArray : Array<Drivers>, i : Int, carModel : String) : Cars // Генерация машины
    {
        val car : Cars = Cars(DriverArray[i].carNum, carModel)
        return car
    }
}