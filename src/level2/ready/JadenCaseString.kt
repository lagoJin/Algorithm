package level2.ready

import assertEquals
import java.lang.NumberFormatException

class JadenCaseString {

    fun solution(s: String): String {
        var answer = ""

        val text = s.split(" ")

        for (i in text.indices) {
            answer += textToUpperCase(text[i])
            if (i != text.size - 1) answer += " "
        }

        println(answer)
        return answer
    }

    fun textToUpperCase(text: String): String {
        return try {
            val numberCheck = text[0].toString().toInt()
            text
        } catch (e: NumberFormatException) {
            println(text)
            val result = text.replaceRange(0..0, text[0].toUpperCase().toString())
            println(result)
            result
        }
    }

}

fun main() {
    val jadenCaseString = JadenCaseString()
    jadenCaseString.solution("3people unFollowed me").assertEquals("3people Unfollowed Me")
    jadenCaseString.solution("for the last week").assertEquals("For The Last Week")

}