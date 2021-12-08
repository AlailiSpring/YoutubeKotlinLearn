import com.learn.alaili.day211208.AccountTypeEnum
import com.learn.alaili.day211208.AccountTypeWithMethod
import com.learn.alaili.day211208.Vehicle

fun main(){

    var vehicle = Vehicle()
    vehicle.brand = "Tesla"
    vehicle.info()

    //内部类的调用
    vehicle.EletricSteeringWheel().info()

    Vehicle.Steeringheel().info()
    Vehicle.Transmission().shift()

    val value = AccountTypeEnum.valueOf("Platinum".toUpperCase())
    println(value)
    println(value.discount)

    for(accountType in AccountTypeWithMethod.values()){
        println(accountType)
    }

}