package level1

import assertEquals
import kotlin.math.max

//https://programmers.co.kr/learn/courses/30/lessons/12940
class MaxmumMultiple {

    fun solution(n: Int, m: Int): IntArray {
        val answer = ArrayList<Int>()

        var min = 0
        val max: Int

        for (i in 1 until n + 1) {
            if (n % i == 0 && m % i == 0) {
                min = i
            }
        }

        max = (n * m) / min
        answer.add(min)
        answer.add(max)

        return answer.toIntArray()
    }
}

fun main() {

    val maxmumMultiple = MaxmumMultiple()
    maxmumMultiple.solution(3, 12).assertEquals(intArrayOf(3, 12))
    maxmumMultiple.solution(2, 5).assertEquals(intArrayOf(1, 10))

}
