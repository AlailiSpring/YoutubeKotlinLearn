package com.learn.alaili.day211206

class Person{
    var firstName:String=""
    var lastName:String=""

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun updateFirstName(newName: String) {
        firstName = newName
    }
}