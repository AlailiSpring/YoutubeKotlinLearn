import com.learn.alaili.day211209.Cat

fun main(){
    var cat1 = Cat("Red", "Tommy")
    var cat2 = Cat("Red", "Tommy")
    println(cat1 == cat2)

    //如果我们只是想比较对象中的数据是否一致
    //我们可以对Cat对象声明时加入前缀 data，然后就可以进行纯数据的比较了
    val firstName = cat1.component1()
    var lastName = cat1.component2()

    println("$firstName --$lastName")

    //一次性接收多个参数值的示例
    var (firstNameNew, lastNameNew) = cat1
    println("$firstNameNew:$lastNameNew")

    //复制data对象的方法,浅拷贝shallow copy
    //it's important to know that this is not a full deep copy
    var cat3 = cat1.copy(firstName = "Black")
    println(cat3)

}