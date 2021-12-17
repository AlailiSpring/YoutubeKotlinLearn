import com.learn.alaili.day211217.getLongestString

fun main(){

    var list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)
    //需使⽤所定义包之外的⼀个扩展，只需在调⽤⽅导⼊它
    //调用别处的扩展
    list.getLongestString()
}

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}