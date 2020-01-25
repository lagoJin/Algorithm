package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12928
class NumberSum {

    fun solution(n: Int): Int {
        var answer = 0

        for (i in 1..n) {
            if (n % i == 0) {
                answer += i
            }
        }
        return answer
    }
}

fun main() {
    val numberSum = NumberSum()
    numberSum.solution(12).assertEquals(28)
    numberSum.solution(5).assertEquals(6)
}