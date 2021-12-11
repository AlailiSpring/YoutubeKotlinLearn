package com.learn.alaili.day211211

//抽象类可以继承抽象类
abstract class TwoDoorCar(color:String, numberOfWheels:Int):
        Car(color, numberOfWheels, 2) {
    abstract fun driveFast()
}