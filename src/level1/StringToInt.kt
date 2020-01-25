package level1


//https://programmers.co.kr/learn/courses/30/lessons/12925
class StringToInt {

    fun solution(s: String): Int {
        return s.toInt()
    }
}

fun main() {
    val stringToInt = StringToInt()
    stringToInt.solution("-1234")
}