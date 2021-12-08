package com.learn.alaili.day211208

enum class AccountTypeWithMethod() {
    BRONZE() {
        override fun caculateDiscount() :Int{
            return 5
        }
    },
    SILVER() {
        override fun caculateDiscount():Int {
            TODO("Not yet implemented")
        }
    },
    GOLD() {
        override fun caculateDiscount():Int {
            TODO("Not yet implemented")
        }
    },
    PLATINUM() {
        override fun caculateDiscount():Int {
            TODO("Not yet implemented")
        }
    };

    //定义了抽象方法，需要再枚举类中做出实现
    abstract fun caculateDiscount():Int
}