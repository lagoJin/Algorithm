package level1

import assertEquals

class CaesarCode {

    fun solution(s: String, n: Int): String {
        var answer = ""

        val english = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "W", "x", "y", "z")

        s.forEach {
            answer += if (it.toString() == " ") {
                " "
            } else {

                val index = english.indexOf(it.toString().toLowerCase())
                if (index > 24) {
                    val searchIndex = (index + n) % 25
                    if (searchIndex - 1 == -1) {
                        caseCheck("z", english.contains(it.toString()))
                    } else {
                        caseCheck(english[searchIndex - 1], english.contains(it.toString()))
                    }
                } else {
                    english[index + n]
                    caseCheck(english[index + n], type = english.contains(it.toString()))
                }
            }
        }

        return answer
    }

    private fun caseCheck(value: String, type: Boolean): String {
        return if (type) {
            //소문자
            value.toLowerCase()
        } else {
            //대문자
            value.toUpperCase()
        }
    }

}

fun main() {

    val caesarCode = CaesarCode()
    caesarCode.solution("AB", 1).assertEquals("BC")
    caesarCode.solution("z", 1).assertEquals("a")
    caesarCode.solution("a B Z", 4).assertEquals("e F D")
    caesarCode.solution("z", 25).assertEquals("z")

}