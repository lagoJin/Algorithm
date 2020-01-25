package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12901
class YearCheck {

    fun solution(a: Int, b: Int): String {
        var answer = ""

        var day = 0
        val month = intArrayOf(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30)
        val list = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

        for (i in 0 until a) {
            day += month[i]
        }
        day += b

        val index = (day % 7) - 1
        if (index == -1) return "THU"
        return list[index]
    }

}

fun main() {

    val yearCheck = YearCheck()
    yearCheck.solution(1, 2).assertEquals("SAT")
    yearCheck.solution(1, 5).assertEquals("TUE")
    yearCheck.solution(2, 29).assertEquals("MON")
    yearCheck.solution(5, 24).assertEquals("TUE")
    yearCheck.solution(9, 10).assertEquals("SAT")
    yearCheck.solution(12, 15).assertEquals("THU")

}