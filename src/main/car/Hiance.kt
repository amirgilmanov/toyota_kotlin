package main.car

import main.Transmission
import main.WheelType
import main.WheelType.HIANCE
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.Wheel
import java.math.BigDecimal

class Hiance : Truck {
    var spareWhell: Wheel = Wheel(true, HIANCE)

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
        spareWhell: Wheel
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
        this.spareWhell = spareWhell
    }
}