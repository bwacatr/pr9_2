package Dispatcher

import java.sql.Driver
import kotlin.random.Random

open class Dispatcher {

    open fun InfoAll(TripsArray : Array<Trips>, DriverArray : Array<Drivers>, CarArray : Array<Cars>, i: Int) // Вывод всей информации из каждого массива
    {
        println("Заявка на рейс: ${TripsArray[i].application}, номер рейса: ${TripsArray[i].tripNum}, номер клиента: ${TripsArray[i].clientNum}")
        println("номер машины: ${DriverArray[i].carNum}, номер водителя: ${DriverArray[i].driverNum}")
        println("модель машины: ${CarArray[i].carModel}")
    }




}