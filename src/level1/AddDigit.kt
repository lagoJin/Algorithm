package level1

//https://programmers.co.kr/learn/courses/30/lessons/12931
class AddDigit {

    fun solution(n: Int): Int {
        var answer = 0
        n.toString().forEach { answer += it.toString().toInt() }
        return answer

    }
}

fun main() {

}