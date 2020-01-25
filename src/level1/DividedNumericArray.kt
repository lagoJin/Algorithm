package level1

import assertEquals

class DividedNumericArray {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = ArrayList<Int>()

        for (i in arr.indices) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i])
            }
        }
        if (answer.size == 0) answer.add(-1)
        return answer.sorted().toIntArray()
    }
}

fun main() {
    val dividedNumericArray = DividedNumericArray()
    dividedNumericArray.solution(intArrayOf(5, 9, 7, 10), 5).assertEquals(intArrayOf(5, 10))
    dividedNumericArray.solution(intArrayOf(2, 36, 1, 3), 1).assertEquals(intArrayOf(1, 2, 3, 36))
    dividedNumericArray.solution(intArrayOf(3, 2, 6), 10).assertEquals(intArrayOf(-1))
}