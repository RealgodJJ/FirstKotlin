fun main() {
    val nums1 = 1..100//数组1-100
    for (num in nums1) {
        print("$num\n")
    }

    val nums2 = 1..16
    for (num in nums2 step 2) {
        println(num)
    }

    val nums3 = nums2.reversed()
    for (num in nums3)
        println(num)

    println("数组的总数：${nums2.count()}")
}