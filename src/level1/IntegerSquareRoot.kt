package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12934
class IntegerSquareRoot {

    fun solution(n: Long): Long {
        for (i in 1..n) {
            if (i * i == n) {
                return ((i + 1) * (i + 1))
            }
        }
        return -1
    }

}

fun main() {
    val interSquareRoot = IntegerSquareRoot()
    interSquareRoot.solution(121).assertEquals(144)
    interSquareRoot.solution(3).assertEquals(-1)
}