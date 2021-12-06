package com.learn.alaili.day211206

fun main(){
    var person = Person()
    person.firstName = "Alaili"
    person.lastName = "Lee"
    person.printFullName()

    person.updateFirstName("Alex")
    person.printFullName()

    var goodDog = Dog(name = "Koddy",
            color = "white")
    goodDog.describe()

    Dog(name = "Jay")
}

