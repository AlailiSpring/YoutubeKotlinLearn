fun main(){
    //方法调用的时候可以不加入默认的参数调用，加入默认的调用参数之后，新的值会覆盖旧有的默认值
    printAuthor("xiaoming", 32)
}

//方法定义时候可以加入默认值
fun printAuthor( name:String, age:Int, title:String="zhaoyao"){
    println("this is a book named $title writed by $name and his age is $age")
}