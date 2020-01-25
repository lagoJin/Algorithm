package level1

import assertEquals
import kotlin.math.abs

class ABetweenB {

    fun solution(a: Int, b: Int): Long {
        var answer = 0L
        if (a == b) return a.toLong()
        val list = intArrayOf(a, b)
        list.sort()
        for (i in list[0]..list[1]) {
            answer += i
        }

        return answer
    }

}

fun main() {
    val aBetweenB = ABetweenB()
    aBetweenB.solution(3, 5).assertEquals(12)
}