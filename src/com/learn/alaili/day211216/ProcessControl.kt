import com.learn.alaili.day211216.Inject

fun main(){

    //For的写法
    for (i in 1..3) {
        println(i)
    }
    //带有步频的
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    //使用索引 和 for遍历数组或者list
    var array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        println(array[i])
    }
    //或者使用库函数withIndex来遍历
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

}




