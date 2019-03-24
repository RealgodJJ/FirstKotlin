//利用默认参数和具名参数
val Pi = 3.14159f
//获取圆柱体体积
fun 获取圆柱体的体积(PI:Float = Pi, 半径:Float, 高:Float): Double {
    return PI * Math.pow(半径.toDouble(), 2.0) * 高
}

fun main() {
    val volume = 获取圆柱体的体积(半径 = 1f, 高 = 2f)
    println(volume)
}