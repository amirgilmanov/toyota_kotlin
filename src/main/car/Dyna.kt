package main.car

import main.Transmission
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.Rosette
import main.detail.Wheel
import java.math.BigDecimal

class Dyna : Truck{
    var rosette: Rosette

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
        velocity: Int,
        rosette: Rosette
    ) : super(
        color,
        maxSpeed,
        transmission,
        isMoving,
        wheels,
        gazTank,
        engine,
        electrocity,
        headlights,
        price,
        velocity
    ) {
        this.rosette = rosette
    }

    fun chargePhone(){
        rosette.isWork = true
        print("Зарядка телефона работает")
    }
}