package Dispatcher

import java.sql.Driver
import kotlin.random.Random

open class Dispatcher {

    fun InfoAll(TripsArray : Array<Trips>, DriverArray : Array<Drivers>, CarArray : Array<Cars>, i: Int) // Вывод всей информации из каждого массива
    {
        println("Заявка на рейс: ${TripsArray[i].application}, номер рейса: ${TripsArray[i].tripNum}, номер клиента: ${TripsArray[i].clientNum}")
        println("номер машины: ${DriverArray[i].carNum}, номер водителя: ${DriverArray[i].driverNum}")
        println("модель машины: ${CarArray[i].carModel}")
    }

    fun CostCalculate(driver : Drivers, cost : Double) : Double //калькуляция цены
    {
        var price = driver.costModifier * cost
        return price
    }




}