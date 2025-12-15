package main.car

import main.Transmission
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.MiniFridge
import main.detail.Roof
import main.detail.Wheel
import java.math.BigDecimal

//Для модели solara характерно наличие мини холодильника (функция охладить напиток)
class Solara : Cabriolet{
   var miniFridge: MiniFridge

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
        roof: Roof,
        miniFridge: MiniFridge
    ) : super(color, maxSpeed, transmission, isMoving, wheels, gazTank, engine, electrocity, headlights, price, roof) {
        this.miniFridge = miniFridge
    }

    fun collDrinks(){
        miniFridge.isWork = true
        print("Напитки охлаждаются")
    }
}