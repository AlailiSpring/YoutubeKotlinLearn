import com.learn.alaili.day211207.User

fun main() {
    var user = User("Alaili", "Spring")
    when {
        user.firstName == "Alaili" && user.lastName == "Spring" -> {
            println("Yeah!got my fullName!")
        }
        user.lastName == "Atom" -> {
            println("wow!got wrong!")
        }
        else -> {
            println("not a right name")
        }
    }

    when (user.firstName) {
        "Alaili" -> {
            println("1")
        }
        "XiaoMing" -> {
            println("2")
        }
        else -> {
            println("end")
        }
    }

}