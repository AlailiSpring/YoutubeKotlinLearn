import com.learn.alaili.day211216.Inject

fun main(){
    Constructors(1)
}

//如果构造函数有注解或可⻅性修饰符，这个 constructor 关键字是必需的，并且这些修饰符在它前⾯
class Customer public @Inject constructor(name: String) {
    /*……*/
}
//如果构造函数没有，则可以省略这个关键字
class Consumer(name:String){
    /*……*/
}

class Constructors {

    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }
}

//kotlin主构造函数声明在类的声明上，次构造函数需要带有前缀constructor
//不管有没有显式的主构造函数，次构造函数都需要委托给主构造函数
class Person(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: Person) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}

class NewPerson(val name: String) {

    val children: MutableList<Person> = mutableListOf()

    constructor(name: String, parent: Person) : this(name) {
        children.add(parent)
    }
}
//如果⼀个⾮抽象类没有声明任何（主或次）构造函数，它会有⼀个⽣成的不带参数的主
//构造函数。构造函数的可⻅性是 public
//在 JVM 上，如果主构造函数的所有的参数都有默认值，编译器会⽣成⼀个额外的
//⽆参构造函数，它将使⽤默认值。这使得 Kotlin 更易于使⽤像 Jackson 或者 JPA
//这样的通过⽆参构造函数创建类的实例的库

