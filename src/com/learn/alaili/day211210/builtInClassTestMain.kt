fun main() {
    //kotlin 内建函数
    var pair = Pair("Alaili", "Spring")

    var pairSuger = "Alaili" to "Spring"

    println(pair.first)
    println(pair.second)

    println(pairSuger.first)
    println(pairSuger.second)

    var triple = Triple("A", "B", "C")
    println(triple.first)
    println(triple.second)
    print(triple.third)

}