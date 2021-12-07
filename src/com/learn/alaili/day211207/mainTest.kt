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

}