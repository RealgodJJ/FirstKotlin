package wash_machine

class WashMachine(var module: String, var size: Int) {
    private var isDoorOpen = true
    private var mode = 0

    fun openDoor() {
        println("${module}洗衣机的门已经打开了......")
        isDoorOpen = true
    }

    fun closeDoor() {
        println("${module}洗衣机的门已经关闭了......")
        isDoorOpen = false
    }

    fun selectMode(mode: Int): Int {
        this.mode = mode
        return when (mode) {
            0 -> {
                println("初始模式")
                0
            }
            1 -> {
                println("轻柔模式")
                1000
            }
            2 -> {
                println("快速模式")
                2000
            }
            else -> {
                println("无效设置")
                -1
            }
        }
    }

    fun start(speed: Int) {
        if (isDoorOpen) {
            println("没有关闭洗衣机门......")
        } else {
            println("放水......")
            println("水放满了......")
            println("电机转动......")
            setMotorSpeed(speed)
            println("洗干净了......")
        }
    }

    private fun setMotorSpeed(speed: Int) {
        println("当前发动机的转速为${speed}圈/秒")
    }
}