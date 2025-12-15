package main.car

import main.Transmission
import main.detail.CruisControl
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.Usb
import main.detail.Wheel
import java.math.BigDecimal

//Для модели camry характерно наличие usb (функция подключить музыку)
class Camry : LightCar{
    var usb: Usb

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
        cruisControl: CruisControl,
        usb: Usb
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
        cruisControl
    ) {
        this.usb = usb
    }

    fun connectMusic(){
        usb.isWork = true
        print("Музыка включена")
    }
}
