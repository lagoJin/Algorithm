package level1

import assertEquals

class TextToSorted {

    fun solution(s: String): String {
        var answer = ""
        s.toCharArray().sortedByDescending { it }.forEach {
            answer += it.toString()
        }

        return answer
    }

}

fun main() {

    val textToSorted = TextToSorted()
    textToSorted.solution("Zbcdefg").assertEquals("gfedcbZ")

}