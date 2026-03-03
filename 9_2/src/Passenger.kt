package Passenger
class Passenger constructor(var name : String, var pass: Int, var money: Int){

    fun SetPass(a : Int)    //выбор пропуска с проверкой на количество денег
    {
        if (a >= 0 && a <= 2) {
            when (a) {
                0 -> {
                    if (money >= 100) {
                        money = money - 100
                        pass = 0
                    } else {
                        println("Недостаточно денег для первого пропуска")
                        pass = -1
                    }
                }

                1 -> {
                    if (money >= 500) {
                        money = money - 500
                        pass = 1
                    } else {
                        println("Недостаточно денег для второго пропуска")
                        pass = -1
                    }
                }

                2 -> {
                    if (money >= 1000) {
                        money = money - 1000
                        pass = 2
                    } else {
                        println("Недостаточно денег для третьего пропуска")
                        pass = -1
                    }
                }
            }
        }
        else
        {
            println("Такого пропуска не существует")
        }
    }

    fun Info() // вывод информации
    {
        println("Имя пассажира: $name")
        if (pass == -1)
        {
            println("Нет пропуска")
        }
        else
        {println("пропуск: $pass")}
        println("Кол-во денег: $money")
    }
}