fun diaryGenerate(placeName: String): String {
    return """我最开心的事就是和我的蠢萌小朋友一起去${placeName}玩，哪怕最后关门了，我们在门口看到"$placeName"这${placeName.length}个字也好！
"""
//    return "I miss you means \"I love you\"."
}

fun main() {
    println(diaryGenerate("动物园"))
}