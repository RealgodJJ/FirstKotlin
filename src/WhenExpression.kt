fun gradeStudent(score: Int) {
    when (score) {
        10 -> print("完美！")
        9 -> print("优秀！")
        8 -> print("哎呦还不错！")
        7 -> print("继续努力！")
        6 -> print("刚及格！")
        else -> print("重读小学吧！")
    }
}

fun StringToScore(str: String): Int {
    val score = when (str) {
        "完美！" -> 10
        "优秀！" -> 9
        "哎呦还不错！" -> 8
        "继续努力！" -> 7
        "刚及格！" -> 6
        "重读小学吧！" -> 5
        else -> 0
    }
    return score
}

fun main() {
    gradeStudent(3)
    print("\n得分：${StringToScore("刚及格！")}")
}