fun main() {
    var myInt: Int = 32
    println(myInt.plus(10))
    println(myInt.minus(20))

    //kotlin中定义字符串和字符，注意和java的不同
    var myString: String = "xiaoming"
    var mychar: Char = 's'

    //kotlin中换行的特殊写法
    var message = "Hello\n,This is a type of change rows\n,just test it! "
    println(message)

    var newMessage = """
        Hello
        This is new writing ways
        Hope you'll love it
    """.trimIndent()
    println(newMessage)

    //字符串替换的写法
    var name = "baoye"
    var age = 33
    println("Hello $name ,your age is $age,and your name is ${name.length} characters long.")

    //逻辑判断的写法,&& || 用法和java写法一样
    var calories = 1000
    if (calories > 1200) {
        println("you have eat more than you want")
    } else {
        println("you have eat less than you want")
    }
    //kotlin中推荐使用==代替java中的equals，===用于比对数字
}