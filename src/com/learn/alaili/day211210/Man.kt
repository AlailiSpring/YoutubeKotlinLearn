package com.learn.alaili.day211210

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

