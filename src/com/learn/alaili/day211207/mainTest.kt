import com.learn.alaili.day211207.User

fun main(){
    println(User.createUser())

    val users = User.createUserList(5)
    println(users)
    users.forEach{ println(it)}

    //可以调用companion中的属性
    User.users
}

//class替换成object完成了在kotlin中单例类的构建
object createSingle{
    //声明一个变量，延时初始化，告诉编译器，如果没有初始化，再使用的时候会报错！
    lateinit var favouriteFood: String
}