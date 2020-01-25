package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12954
class NumbersSpaced {

    fun solution(x: Int, n: Int): LongArray {
        val answer = longArrayOf().toCollection(ArrayList())

        var count = 0L
        for (i in 1..n) {
            count += x.toLong()
            answer.add(count)
        }

        return answer.toLongArray()
    }

}

fun main() {
    val numbersSpaced = NumbersSpaced()
    numbersSpaced.solution(2, 5).assertEquals(longArrayOf(2, 4, 6, 8, 10))
    numbersSpaced.solution(4, 3).assertEquals(longArrayOf(4, 8, 12))
    numbersSpaced.solution(-4, 2).assertEquals(longArrayOf(-4, -8))
}