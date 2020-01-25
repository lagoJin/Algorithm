package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12935
class MinimumCheck {

    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        if (arr.size == 1) return intArrayOf(-1)

        var count = arr[0]

        for (i in 1 until arr.size) {
            if (count > arr[i]) {
                count = arr[i]
            }
        }

        val list = arr.toCollection(ArrayList())
        list.remove(count)
        return list.toIntArray()
    }
}

fun main() {

    val minimumCheck = MinimumCheck()

    minimumCheck.solution(intArrayOf(4, 3, 2, 1)).assertEquals(intArrayOf(4, 3, 2))
    minimumCheck.solution(intArrayOf(10)).assertEquals(intArrayOf(-1))
    minimumCheck.solution(intArrayOf(1, 3, 5, 7, 8)).assertEquals(intArrayOf(8, 7, 5, 3))
    minimumCheck.solution(intArrayOf(4, 1, 3, 2)).assertEquals(intArrayOf(4, 3, 2))

}