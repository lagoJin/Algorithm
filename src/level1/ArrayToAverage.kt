package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12944
class ArrayToAverage {

    fun solution(arr: IntArray): Double {
        var answer = 0.0
        arr.forEach {
            answer += it
        }
        return answer / arr.size
    }

}

fun main() {
    val arrayToAverage = ArrayToAverage()
    arrayToAverage.solution(intArrayOf(1, 2, 3, 4)).assertEquals(2.5)
    arrayToAverage.solution(intArrayOf(5, 5)).assertEquals(5)
}