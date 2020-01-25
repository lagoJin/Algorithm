class IntegerSort {

    fun solution(n: Long): Long {
        var answer = ""
        val result = n.toString().map { it.toString().toLong() }.sortedByDescending { it }
        result.forEach {
            answer += it.toString()
        }

        return answer.toLong()
    }

}

fun main() {
    val integerSort = IntegerSort()
    integerSort.solution(118372)
}