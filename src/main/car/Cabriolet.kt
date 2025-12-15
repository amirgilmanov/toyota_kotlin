package main.car

import main.Transmission
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.Roof
import main.detail.Wheel
import java.math.BigDecimal

//Для кабриолета характерно возможность опустить или поднять крышу ( следовательно и состояние этой крыши)
abstract class Cabriolet : Car{
    var roof: Roof

    constructor(
        color: String,
        maxSpeed: Int,
        transmission: Transmission,
        isMoving: Boolean,
        wheels: Array<Wheel>,
        gazTank: GazTank,
        engine: Engine,
        electrocity: Electrocity,
        headlights: Headlights,
        price: BigDecimal,
        roof: Roof
    ) : super(color, maxSpeed, transmission, isMoving, wheels, gazTank, engine, electrocity, headlights, price) {
        this.roof = roof
    }

    fun rooUp(){
        roof.isWork = true
        print("Крыша поднята")
    }
}