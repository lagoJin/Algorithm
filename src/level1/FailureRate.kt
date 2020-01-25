package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/42889
class FailureRate {

    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        var peopleCount = stages.size
        val list = stages.toMutableList()



        return answer
    }

}

fun main() {

    val failureRate = FailureRate()
    failureRate.solution(5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)).assertEquals(intArrayOf(3, 4, 2, 1, 5))
    failureRate.solution(4, intArrayOf(4, 4, 4, 4, 4)).assertEquals(intArrayOf(4, 1, 2, 3))

}