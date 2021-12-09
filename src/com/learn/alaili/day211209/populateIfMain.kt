import com.learn.alaili.day211208.AccountTypeEnum

fun main(){
    //直接定义对象接收if else判断的返回值
    var accountType = AccountTypeEnum.GOLD
    var messgae = when (accountType) {
        AccountTypeEnum.GOLD -> "Gold Member"
        //此处如果不加else的话，我们需要把枚举中所有的类型都包括进来
        //else -> "Normal Member"
        AccountTypeEnum.BRONZE -> TODO()
        AccountTypeEnum.SILVER -> TODO()
        AccountTypeEnum.PLATINUM -> TODO()
    }
    println(messgae)
}