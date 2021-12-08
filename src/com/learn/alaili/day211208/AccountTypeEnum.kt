package com.learn.alaili.day211208

//定义枚举类型
enum class AccountTypeEnum(var discount: Int = 10) {
    BRONZE(10),
    SILVER(25),
    GOLD(15),
    PLATINUM(20)
}