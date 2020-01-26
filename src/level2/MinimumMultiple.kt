package level2

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12953
class MinimumMultiple {

    fun solution(arr: IntArray): Int {
        val max = arr.max()!!

        for (i in max..10000000) {
            var count = 0
            for (j in arr) {
                if (i % j == 0) {
                    count++
                }
                if (count == arr.size) {
                    return i
                }
            }
        }
        return -1
    }

}

fun main() {

    val minimumMultiple = MinimumMultiple()
    minimumMultiple.solution(intArrayOf(2, 6, 8, 14)).assertEquals(168)
    minimumMultiple.solution(intArrayOf(1, 2, 3)).assertEquals(6)
    minimumMultiple.solution(intArrayOf(2, 5)).assertEquals(10)
    minimumMultiple.solution(intArrayOf(3, 5)).assertEquals(15)
    minimumMultiple.solution(intArrayOf(11, 12)).assertEquals(132)


}