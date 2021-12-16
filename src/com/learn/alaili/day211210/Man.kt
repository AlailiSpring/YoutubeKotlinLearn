package com.learn.alaili.day211210

//默认情况下，Kotlin 类是最终（final）的：它们不能被继承。 要使一个类可继承，请用 open 关键字标记它。
open class Man(var name: String, var age: Int) {
    protected var favouriteFood = "waterMelon"

    fun printMyFavFood() {
        println(favouriteFood)
    }
}

//Chief继承了Man方法，可以操作其中的protected修饰的属性
class Chief(name: String, age: Int, favFood: String) : Man(name, age) {
    init{
        favouriteFood = favFood
    }

    fun setFavFood(food: String) {
        favouriteFood = food
    }
}

