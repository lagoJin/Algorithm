package level1

import assertEquals
import java.lang.NumberFormatException

//https://programmers.co.kr/learn/courses/30/lessons/12918
class TextBasic {
    fun solution(s: String): Boolean {
        return try {
            if (s.length != 4 && s.length != 6) {
                return false
            }
            s.toInt()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }
}

fun main() {
    val textBasic = TextBasic()
    textBasic.solution("a234").assertEquals(false)
    textBasic.solution("1234").assertEquals(true)
    textBasic.solution("123456z").assertEquals(false)
}