package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/42889
class FailureRate {

    fun solution(N: Int, stages: IntArray): IntArray {
        val answer = IntArray(N)
        var peopleCount = stages.size

        val map = HashMap<Int, Int>()

        for (stage in stages) {
            if (map.containsKey(stage)) {
                map[stage] = map.getValue(stage) + 1
            } else {
                map[stage] = 1
            }

        }

        val resultMap = HashMap<Int, Double>()

        for (i in 1..N) {
            if (map.containsKey(i)) {
                resultMap[i] = (map.getValue(i) / peopleCount.toDouble())
                peopleCount -= map.getValue(i)
            } else {
                resultMap[i] = 0.0
            }
        }

        val list = resultMap.toList().sortedByDescending { (_, value) -> value }

        for (i in 0 until N) {
            answer[i] = list[i].first
        }

        return answer
    }

}

fun main() {

    val failureRate = FailureRate()
    failureRate.solution(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)).assertEquals(intArrayOf(3, 4, 2, 1, 5))
    failureRate.solution(4, intArrayOf(4, 4, 4, 4, 4)).assertEquals(intArrayOf(4, 1, 2, 3))

}