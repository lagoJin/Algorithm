class HIndex {

    fun solution(citations: IntArray): Int {
        var answer = 0
        citations.sort()

        val count = citations.sum()

        answer = count / citations.size


        return answer
    }

}

fun main() {

    val hIndex = HIndex()
    hIndex.solution(intArrayOf(3, 0, 6, 1, 5))
}