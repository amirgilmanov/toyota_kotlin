package main.car

import main.Transmission
import main.detail.Wheel
import main.WheelType
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.Test
import main.exception.ChangeWheelException
import main.exception.StartCarException
import java.math.BigDecimal
import java.math.BigInteger

abstract class Car {
    private var color: String
    private var maxSpeed: Int
    private var transmission: Transmission
    private var isMoving: Boolean
    private var wheels: Array<Wheel>
    private var gazTank: GazTank
    private var engine: Engine
    private var electrocity: Electrocity
    private var headlights: Headlights
    private var price: BigDecimal

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
        price: BigDecimal
    ) {
        this.color = color
        this.maxSpeed = maxSpeed
        this.transmission = transmission
        this.isMoving = isMoving
        this.wheels = wheels
        this.gazTank = gazTank
        this.engine = engine
        this.electrocity = electrocity
        this.headlights = headlights
        this.price = price
    }

    fun changeWheel(wheelFromIndex: Int, wheelTo: Wheel) {
        val wheelFrom: Wheel = wheels.get(wheelFromIndex)

        if (wheelFrom.diameter != wheelTo.diameter) {
            throw ChangeWheelException(wheelFrom.diameter, wheelTo.diameter)
        } else {
            wheels[wheelFromIndex] = wheelTo
        }
    }

//    Начать движение - меняет состояние движения. Начать движение возможно только при: наличии всех колес и они не проколоты, непустом бензобаке, работоспособным электрике и двигателю. Если что то из этого невыполняется, то выкидывается ошибка StartCarException, в сообщении которой содержится причина невозможности движения.
//    Остановить движение - меняет состояние движения. Для остановки не нужно условий.
//    Включить фары - сообщает о работе фар.

    fun turnOnHeadlights() {
        headlights.isWork = true
        print("Фары работают")
    }

    fun start() {
        if (wheels.size < 4) {
            throw StartCarException("Недостаточно колес")
        }

        wheels.forEach { wheel ->
            if (!wheel.isNotBroke) {
                throw StartCarException("Колесо проколото")
            }
        }

        if (gazTank.fuel <= 0) {
            throw StartCarException("Недостаточно топлива")
        }

        if (!engine.isNotBroke || !engine.isNotBroke) {
            throw StartCarException("Двигатель или электроника сломаны")
        }

        isMoving = true
        print("Машина поехала")
    }

    fun stop() {
        isMoving = false
        print("Машина остановилась")
    }

//    Машины состоят из следующих компонентов: 4 колеса, бензобак, двигатель, электрика, фары
//    Каждое колесо имеет состояние - проколото или нет, диаметр (camry - 17, solara - 16, hiance - 20, dyna - 20). Колеса могуть быть заменяемы если они одинакового диаметра.
//    Бензобак имеет атрибут - количество бензина
//    Двигатель имеет атрибут - работоспособен
//    Электрика имеет атрибут - работоспособна
//    Фары имеют атрибут - работоспособны
//    Цена - с центами

    //Для всех машин характерны следующие атрибуты:
// цвет, максимальная скорость, тип коробки передач (акпп, механика, робот), в состоянии движения (да/нет).
}
