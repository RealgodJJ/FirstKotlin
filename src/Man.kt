class Man(private val name: String): Human(name) {
    override fun pee() {
        println("${name}站着Pee")
    }

    override fun eat() {
        println("${name}大口吃饭")
    }
}