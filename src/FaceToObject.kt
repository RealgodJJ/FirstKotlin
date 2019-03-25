class Rectangle(var height: Int, var width: Int) {
    fun calculateArea():Int {
        return height * width
    }
}

fun main() {
    val rect01 = Rectangle(20, 10)
    println("矩形的宽：${rect01.width}")
    println("矩形的高：${rect01.height}")
    println("矩形的面积是：${rect01.calculateArea()}")
}