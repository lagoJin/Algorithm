package level2.ready

import assertEquals


class BigNumber {

    fun solution(number: String, k: Int): String {

        val len = number.length - k
        var answer = ""

        var idx = 0

        if (number[0] == '0') return "0"

        for (i in 0 until len) {
            var max = 0
            for (j in idx..k + i) {
                if (max < number[j].toString().toInt()) {
                    max = number[j].toString().toInt()
                    idx = j + 1
                }
            }
            answer += max
        }

        println(answer)

        return answer
    }
}

fun main() {

    val bigNumber = BigNumber()
    bigNumber.solution("1924", 2).assertEquals("94")
    bigNumber.solution("1231234", 3).assertEquals("3234")
    bigNumber.solution("4177252841", 4).assertEquals("775841")

}