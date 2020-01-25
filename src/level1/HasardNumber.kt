package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12947
class HasardNumber {

    fun solution(x: Int): Boolean {

        var count = 0
        x.toString().forEach {
            count += it.toString().toInt()
        }

        return x % count == 0
    }


}

fun main() {

    val hasardNumber = HasardNumber()
    hasardNumber.solution(10).assertEquals(true)
    hasardNumber.solution(12).assertEquals(true)
    hasardNumber.solution(11).assertEquals(false)
    hasardNumber.solution(13).assertEquals(false)

}

