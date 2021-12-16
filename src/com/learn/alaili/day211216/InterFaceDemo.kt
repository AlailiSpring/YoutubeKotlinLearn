fun main(){

}

/*Kotlin 的接⼝可以既包含抽象⽅法的声明也包含实现。与抽象类不同的是，接⼝⽆法保存状态。
它可以有属性但必须声明为抽象或提供访问器实现。
可以在接⼝中定义属性。在接⼝中声明的属性要么是抽象的，要么提供访问器的实现。
*/
interface MyInterface {
    val count: Int

    val countValue:Int
        get() = 20

    fun bar()
    fun foo() {
        println("This is my interface!")
    }
}

interface MyInterfaceTwo {
    fun bar()

    fun foo() {
        println("This is my interface!")
    }
}

//⼀个类或者对象可以实现⼀个或多个接⼝
class interfaceTest:MyInterface,MyInterfaceTwo {
    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val count: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun foo() {
        super<MyInterface>.foo()
        super<MyInterfaceTwo>.foo()
    }

}

//接口之间可以继承,当然也支持多重继承
interface human{
    val color: String
}

interface cry{
    fun whoiscry()
}

interface YellowRace : human, cry {
    val height: String
    override val color: String get() = "yellow"
}