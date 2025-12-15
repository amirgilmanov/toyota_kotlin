package main.exception

class ChangeWheelException(diameterFrom: Int, diameterTo: Int) : RuntimeException
    (" Не могу заменить колесо т.к. диаметр $diameterFrom, а пришел $diameterTo")
