package main.factory

import main.WheelType
import main.detail.CruisControl
import main.detail.Electrocity
import main.detail.Engine
import main.detail.GazTank
import main.detail.Headlights
import main.detail.MiniFridge
import main.detail.Roof
import main.detail.Rosette
import main.detail.Usb
import main.detail.Wheel

class Factory(var country: String) {

    fun createCruisControl(): CruisControl {
        return CruisControl(isNotBroke = true, isWork = false)
    }

    fun createElectrocity(): Electrocity {
        return Electrocity(isNotBroke = true, isWork = false)
    }

    fun createEngine(): Engine {
        return Engine(isNotBroke = true, isWork = false)
    }

    fun createGazTank(): GazTank {
        return GazTank(false, 0.0)
    }

    fun createHeadLights() : Headlights {
        return Headlights(isNotBroke = true, isWork = false)
    }

    fun createMiniFridge() : MiniFridge {
        return MiniFridge(isNotBroke = true, isWork = false)
    }

    fun createRoof() : Roof {
        return Roof(isNotBroke = true, isWork = false)
    }

    fun createRosette() : Rosette {
        return Rosette(isNotBroke = true, isWork = false)
    }

    fun createUsb() : Usb {
        return Usb(isNotBroke = true, isWork = false)
    }

    fun createWheels(diameter: WheelType): Array<Wheel> {
        return arrayOf(
            Wheel(false, diameter),
            Wheel(false, diameter),
            Wheel(false, diameter),
            Wheel(false, diameter),
        )
    }

    //Мы с вами создали машины, их детали, описали действия. Но создавать машины сейчас крайне неудобно:
// нам приходиться самим создавать детали, передавать их в конструктор. А ведь менеджеру нужно только установить цену машины и ее цвет!
    //Необходимо:
    //1. Реализовать фабрику производств деталей - класс, в котором будут методы создающие все наши детали в работоспособном состоянии, (бензобак должен быть пустой). У завода должнен быть атрибут - страна( ведь заводов может быть много). Подумать, какой тип данных у атрибута Страна.
    //2. Реализовать сборочный конвеер - класс, который будет использовать фабрику производств и отдавать нам готовые машины.
// Например должен быть метод, который принимает в себя два параметра - цвет и цену,
// а возвращает новую Camry. Необходимо создать 4 метода, которые будут создавать все наши модели:
// createCamry, createSolara, createHiance, createDyna.
// Сборочный конвеер может пользоваться только той фабрикой производств,
// которая находится в той же стране (Подумать где должна происходить эта проверка).
// Иначе должна появляться ошибка:
// CountyFactoryNotEqualException - в описании ошибки должны описаться страны которые не совпали.
}