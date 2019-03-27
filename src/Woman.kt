class Woman(private val name: String) : Human(name) {
    override fun eat() {
        println("${name}小口吃饭")
    }

    override fun pee() {
        println("${name}蹲着pee")
    }
}

fun main() {
    val woman = Woman("江江")
    woman.eat()
    woman.pee()

    val man = Man("老林")
    man.eat()
    man.pee()

    println("=========================")
    val house = ArrayList<Human>()
    house.add(man)
    house.add(woman)
    for (person in house) {
        person.eat()
        person.pee()
    }
}