package level1

import assertEquals
import kotlin.math.roundToInt

//https://programmers.co.kr/learn/courses/30/lessons/12903
class CenterWord {

    fun solution(s: String): String {
        var answer = ""

        val index = (s.length / 2.toDouble()).roundToInt()
        if (s.length % 2 == 0) {
            //짝수
            for (i in index - 1..index) {
                answer += s[i]
            }
        } else {
            //홀수
            answer += s[index - 1]
        }

        return answer
    }

}

fun main() {
    val centerWord = CenterWord()
    centerWord.solution("abcde").assertEquals("c")
    centerWord.solution("qwer").assertEquals("we")
}