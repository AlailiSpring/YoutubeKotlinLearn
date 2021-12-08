package com.learn.alaili.day211207

class User(var firstName: String , var lastName: String) {

    //companion类似于java中的static
    companion object {
        var users = mutableListOf<User>()
        fun createUserList(count: Int): List<User> {
            for (i in 1..count) {
                users.add(User("firstName$i ", "lastName$i"))
            }
            return users
        }

        fun createUser(firstName: String="", lastName: String=""): User {
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return  User("MeiMei","Han")
            }
            return User(firstName, lastName)
        }
    }

    init {
        println("$firstName--$lastName")
    }
}