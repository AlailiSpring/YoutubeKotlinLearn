fun main(){

}

/*默认情况下，Kotlin 类是最终（final）的——它们不能被继承。 要使⼀个类可继承，请
⽤ open 关键字标记它：*/
open class Base(p:Int) // 该类开放继承

open class View(val ctx: Context) {
    constructor(ctx: Context,attrs: AttributeSet): this(ctx)
}

open class Context

//如果派⽣类有⼀个主构造函数，其基类可以（并且必须）根据其参数在该主构造函数中
//初始化。
//如果派⽣类没有主构造函数，那么每个次构造函数必须使⽤ super 关键字初始化其基
//类型，或委托给另⼀个做到这点的构造函数。 请注意，在这种情况下，不同的次构造函
//数可以调⽤基类型的不同的构造函数：
class MyView : View {

    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

class AttributeSet {
}

//Kotlin 对于可覆盖的成员以及覆盖后的成员需要显式修饰符：override
//属性与⽅法的覆盖机制相同。在超类中声明然后在派⽣类中重新声明的属性必须以override 开头，并且它们必须具有兼容的类型。
open class Shape {

    open fun draw() { /*……*/ }

    fun fill() { /*……*/ }
}
class Circle() : Shape() {

    override fun draw() { /*……*/ }
}

//你也可以⽤⼀个 var 属性覆盖⼀个 val 属性，但反之则不⾏。 这是允许的，因为⼀
//个 val 属性本质上声明了⼀个 get ⽅法， ⽽将其覆盖为 var 只是在⼦类中额外声
//明⼀个 set ⽅法。



//kotlin支持多重继承，继承不同的类，但是有同名的方法时，必须给与确定的实现
open class Rectangle {

    open fun draw() { /* …… */ }
}
interface Polygon {

    fun draw() { /* …… */ } // 接⼝成员默认就是“open”的
}
class Square() : Rectangle(), Polygon {

// 编译器要求覆盖 draw()：

    override fun draw() {

        super<Rectangle>.draw() // 调⽤ Rectangle.draw()

        super<Polygon>.draw() // 调⽤ Polygon.draw()
    }
}
//可以同时继承 Rectangle 与 Polygon ， 但是⼆者都有各⾃的 draw() 实现，所以必须
//在 Square 中覆盖 draw() ， 并为其提供⼀个单独的实现以消除歧义。
