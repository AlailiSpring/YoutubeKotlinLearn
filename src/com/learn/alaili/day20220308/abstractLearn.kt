fun main(){
    var by = BaoYeCar("red",2)
    by.drive()
    by.driveFast()
}

abstract class Vehicle(color:String,numberOfWheels:Int){
    abstract fun drive()
}

abstract class TwoDoorVehicle(color:String,numberOfWheels:Int):Vehicle(color,
numberOfWheels){
    abstract fun driveFast()
}

class BaoYeCar(color:String,numberOfWheels:Int):TwoDoorVehicle(color,
        numberOfWheels){
    override fun driveFast() {
        //TODO("Not yet implemented")
        println("My car goes fast!")
    }

    override fun drive() {
        //TODO("Not yet implemented")
        println("My car are driving!")
    }

}