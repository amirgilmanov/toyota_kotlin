package main.car

import main.Transmission
import main.detail.CruisControl
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.Wheel
import java.math.BigDecimal

//Для легковых авто характерно наличие круиз контроля, и возможности включить или выключить его.
abstract class LightCar : Car {
    private var cruisControl: CruisControl

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
        cruisControl: CruisControl
    ) : super(color, maxSpeed, transmission, isMoving, wheels, gazTank, engine, electrocity, headlights, price) {
        this.cruisControl = cruisControl
    }


    fun turnOnCruisControl(){
        cruisControl.isWork = true
        print("Круиз контроль включен")
    }
}
