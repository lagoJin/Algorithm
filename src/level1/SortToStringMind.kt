package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12915
class SortToStringMind {

    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.sorted().sortedBy { it[n] }.toTypedArray()
    }

}

fun main() {

    val sortToStringMind = SortToStringMind()
    sortToStringMind.solution(arrayOf("sun", "bed", "car"), 1).assertEquals(arrayOf("car", "bed", "sun"))
    sortToStringMind.solution(arrayOf("abce", "abcd", "cdx"), 2).assertEquals(arrayOf("abcd", "abcd", "cdx"))

}