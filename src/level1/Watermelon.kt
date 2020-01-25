package level1

import assertEquals

class Watermelon {
    fun solution(n: Int): String {
        var answer = ""
        for (i in 1..n) {
            answer += if (i % 2 != 0) {
                "수"
            } else {
                "박"
            }
        }

        return answer
    }


}

fun main() {

    val watermelon = Watermelon()
    watermelon.solution(3).assertEquals("수박수")
    watermelon.solution(4).assertEquals("수박수박")

}