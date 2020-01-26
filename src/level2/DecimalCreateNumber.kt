package level2

import assertEquals
import java.util.*

//https://programmers.co.kr/learn/courses/30/lessons/12977
class DecimalCreateNumber {

    fun solution(nums: IntArray): Int {
        var answer = 0



        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin")

        return answer
    }

}

fun main() {

    val decimalCreateNumber = DecimalCreateNumber()
    decimalCreateNumber.solution(intArrayOf(1, 2, 3, 4)).assertEquals(1)
    decimalCreateNumber.solution(intArrayOf(1, 2, 7, 6, 4)).assertEquals(4)

}