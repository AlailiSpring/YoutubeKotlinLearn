/**
 * first time of learning kotlin in 2021.10.30 pm
 */
fun main(){
    println("Hello World!")
    var author="Alaili Lee"
    println(author)
    println(author.isEmpty())

    var age=33
    println(age)

    //readonly variables with val
    val cannotbereassignedVaribles="xiaoming"
    println(cannotbereassignedVaribles)

    //it's not a right way to reassign a variable with val,just remember it ,this is  the rule!
    //cannotbereassignedVaribles="hanmeimei"

    //查看赋值的类型
    var myname="Libaodeng"
    print(myname::class)

    //设置精确地参数类型的方式
    var myNewName: String = "new Libaodeng"
    var myNumber: Int = 30

    //kotlin内置类型说明
    var myByte: Byte = 8 //8 bit signed integer
    var myShort: Short = 16
    var myInt: Int = 32
    var myLong: Long = 64

}