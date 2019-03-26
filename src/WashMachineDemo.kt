fun main() {
    val washMachine = WashMachine("小天鹅", 12)
    washMachine.openDoor()
    washMachine.closeDoor()
    val speed = washMachine.selectMode(1)
    washMachine.start(speed)
}