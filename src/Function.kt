fun add(x: Int, y: Int): Int = x + y

fun main() {
    println(add(3, 4))

    //函数表达式1
    val i = { x: Int, y: Int -> x + y }
    val result = i(3, 4)
    println(result)

    val j: (Int, Int) -> Int = { x, y -> x + y }
    val result1 = j(3, 4)
    println(result1)
}