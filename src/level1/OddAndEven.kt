package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12937
class OddAndEven {

    fun solution(num: Int): String {
        return if (num % 2 == 0) {
            "Even"
        } else {
            "Odd"
        }
    }

}

fun main() {

    val oddAndEven = OddAndEven()
    oddAndEven.solution(3).assertEquals("Odd")
    oddAndEven.solution(4).assertEquals("Even")

}
