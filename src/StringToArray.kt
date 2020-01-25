
//https://programmers.co.kr/learn/courses/30/lessons/12932

class StringToArray {


    fun solution(n: Long): IntArray {
        return n.toString().map { it.toString().toInt() }.reversed().toIntArray()
    }
}

fun main() {

    val reverse = StringToArray()
    reverse.solution(12345)

}
