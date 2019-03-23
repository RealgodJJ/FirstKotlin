fun heat(objects: String?) {
    println("热$objects")
}

fun main(args: Array<String>) {
    println("Hello kotlin!")

//    var number: Int = 256
//    var bigNumber: Long = 9999999999999
//    var name: String = "RealgodJJ"
    val fxxk = "FUCK"
    val fxxk1 = "fuck"

    val aByte: Byte = Byte.MAX_VALUE
    val bByte: Byte = Byte.MIN_VALUE

    val aInt: Int = 0b011

    println("Byte的最大值：$aByte")
    println("Byte的最小值：$bByte")
    println("aInt的数值：$aInt")
    println(aByte < bByte)

    val num1 = Math.sqrt(5.0) - Math.sqrt(4.0)
    val num2 = Math.sqrt(4.0) - Math.sqrt(3.0)
    println(num1 < num2)
    val num3 = Math.pow(2.0, 100.0)
    val num4 = Math.pow(3.0, 75.0)
    println(num3 < num4)

    //true代表忽略大小写的区别；false代表注意大小写的区别
    print(fxxk.equals(fxxk1, false))

    heat("狗")
    heat(null)
}