package com.learn.alaili.day211206

class Dog(var name: String, var color: String = "grey") {

    //初始化调用支出，构造方法完成之后便会参与调用
    init {
        println("Hey This is a block initialization place after constructor is called!")
    }

    //调用这个构造方法，实际上调用的是最外层的原始构造方法
    constructor(name:String):this(name,"UnKown"){
        println("This is a new constructor of creating a dog")
    }

    fun describe() {
        println("This is a dog,his name is $name and his color is $color")
    }
}