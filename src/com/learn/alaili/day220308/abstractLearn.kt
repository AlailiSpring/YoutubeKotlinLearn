fun main(){
    var by = BaoYeCar("red",2)
    by.drive()
    by.driveFast()
}

abstract class Vehicle(color:String,numberOfWheels:Int){
    abstract fun drive()
    abstract fun stop()
}

abstract class TwoDoorVehicle(color:String,numberOfWheels:Int):Vehicle(color,
numberOfWheels){
    abstract fun driveFast()
    override fun stop() {
        //TODO("Not yet implemented")
        println("Funny thing!")
        println("子类实现父类的其中一个抽象方法，后续实现TwoDoorVehicle方法的子类无需强制实现此方法！")

    }
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