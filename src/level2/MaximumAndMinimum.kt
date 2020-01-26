package level2

import assertEquals
import kotlin.math.max

class MaximumAndMinimum {

    fun solution(s: String): String {
        val list = s.split(" ").sortedBy { it.toInt() }

        return "${list.first()} ${list.last()}"
    }
}

fun main() {
    val maximumAndMinimum = MaximumAndMinimum()
    maximumAndMinimum.solution("15 2 30 4").assertEquals("2 30")
    maximumAndMinimum.solution("1 2 3 4").assertEquals("1 4")
    maximumAndMinimum.solution("-1 -2 -3 -4").assertEquals("-4 -1")
    maximumAndMinimum.solution("-1 -1").assertEquals("-1 -1")
}