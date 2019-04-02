package inherit

class Son : Father() {
    override fun action() {
        println("在公共场合很有礼貌！")
    }
}

fun main() {
    val son = Son()
    println("儿子的性格：${son.character}")
    son.action()
}