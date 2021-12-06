fun main(){
//    var x = hello()
//    println(x)

    hello()
    hello("Dean")
    //加上前缀，表明当前参数的字面含义，方便后期的维护，better than java!
    //更牛逼的是，调用的顺序可以不固定，kotlin内部可以帮你进行确认，more cool！！
    describeMe(name = "libaodeng",
            age = 32,
            home = "ShanDong",
            height = 174)
    //多次调用hello()，并不会继续打印
    //但是通过赋值，是可以继续展现的
//    hello()
//    hello()
//    hello()
}

//可以在方法内部继续定义内部方法
fun hello(){
    println( "Hi,There")
    fun bye(){
        println("Bye Bye")
    }
    bye()
}

fun hello(name:String){
    //不需要像java那种采取拼接的写法，这种写法很cool！
    println("Hi,$name,you're here!")
}

//下面的方法定义，在调用的时候，可以加上前缀，表明当前参数的字面含义，方便后期的维护，better than java!
//可以给与默认的值，调用的时候可以不加这个参数，kotlin会默认加上，如果调用时候加入了新的值，会以新的值为主
fun describeMe(name: String, age: Int, home: String, height: Int=180) {
    println("Hi,everyone my name is $name,and my age is $age,and i'm from $home China,my height is $height cm ,Nice to know you guys!")

}