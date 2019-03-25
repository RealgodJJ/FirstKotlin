import java.math.BigInteger

fun main() {
//    val result = recursive(BigInteger("100"))
//    println(result)

    val result = 0

//    val resultNew =
    ollAdd(100, result)
//    println(resultNew)
}

fun recursive(num: BigInteger): BigInteger {
    return when {
        num >= BigInteger.ONE -> num * recursive(num - BigInteger.ONE)
        num == BigInteger.ZERO -> BigInteger.ONE
        else -> -BigInteger.ONE
    }
}

//尾递归优化（kotlin独有）
tailrec fun ollAdd(num: Int, result: Int): Int {
    println("计算机执行了${num}次运算，result=$result")
    return if (num == 0) {
        1
    } else {
        ollAdd(num - 1, result + num)
    }
}