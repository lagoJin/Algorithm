package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12901
class YearCheck {

    fun solution(a: Int, b: Int): String {
        var answer = ""

        val list = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

        val day = b % 7

        return list[day - 1]
    }

}

fun main() {

    val yearCheck = YearCheck()
    yearCheck.solution(5, 24).assertEquals("TUE")
    yearCheck.solution(2, 29).assertEquals("MON")

}