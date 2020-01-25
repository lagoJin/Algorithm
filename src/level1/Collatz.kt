package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12943
class Collatz {

    fun solution(num: Int): Int {
        var answer = num.toLong()

        for (i in 1..500) {
            if (answer == 1L) return num
            if (i == 500) return -1

            when {
                answer % 2 == 0L -> {
                    answer /= 2
                }
                answer % 2 != 0L -> {
                    answer = answer * 3 + 1
                }
            }

            if (answer == 1L) return i

        }

        return answer.toInt()
    }

}

fun main() {

    val collatz = Collatz()
    collatz.solution(6).assertEquals(8)
    collatz.solution(16).assertEquals(4)
    collatz.solution(626331).assertEquals(-1)

}