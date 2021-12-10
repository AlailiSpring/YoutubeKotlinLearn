import com.learn.alaili.day211210.Chief
import com.learn.alaili.day211210.Man

fun main() {
    var man = Man("Alaili", 30)

    man.printMyFavFood()

    var chief = Chief("Ali", 28, "banana")

    chief.printMyFavFood()

    chief.setFavFood("apple")
    chief.printMyFavFood()

}