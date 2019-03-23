import java.util.TreeMap

fun main() {
    val list = listOf("发论文", 1, "挽回我爱的她")
    for (item in list) {
        println(item)
    }

    for ((num, item) in list.withIndex()) {
        println("${num + 1}.$item")
    }

    val map = TreeMap<String, String>()
    map["好"] = "good"
    map["学习"] = "study"
    map["天"] = "day"
    map["向上"] = "up"
    map["坏"] = "bad"

    print(map["好"] + " " + map["好"] + " " + map["学习"])
}