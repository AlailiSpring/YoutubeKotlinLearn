package com.learn.alaili.day211208

class Vehicle {
    var brand: String = "unknown"

    fun info() = println(brand)

    class Steeringheel{
        var name = "The Steering Wheel"
        fun info() = println(name)
    }

    class Transmission{
        var type = "Automatic"
        fun shift() = println("The Vehicle has shifted!")
    }

    //if you want to access thw outer class properties ,you need to declare
    //the class as a inner class
    inner class EletricSteeringWheel{
        var name = "toyota"
        fun info() = println("$brand is a Vehicle better than $name in electric area")
    }
}