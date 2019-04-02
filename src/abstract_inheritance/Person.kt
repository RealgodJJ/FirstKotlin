package abstract_inheritance

class Person: IMan, People() {
    override fun drink() {
        println("喝水了......")
    }

    override fun eat() {
        println("吃饭了......")
    }
}

fun main() {
    val person = Person()
    person.eat()
    person.drink()
    val taiJian = TaiJian()
    taiJian.drink()

    println("=========================")
    val house = listOf<People>(person, taiJian)
    for (one in house) {
        if (one is Person) {
            one.eat()
        }
        if (one is TaiJian) {
            one.drink()
        }
    }
}