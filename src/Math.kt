class Math {


    fun solution(answers: IntArray): IntArray {
        val answer1 = intArrayOf(1, 2, 3, 4, 5)
        val answer2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val answer3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        var answer = mutableListOf<Int>()

        var cnt1 = 0
        var cnt2 = 0
        var cnt3 = 0

        var max = 0

        answers.forEachIndexed { index, i ->
            if (answers[index] == answer1[index % answer1.size]) {
                cnt1++
            }
            if (answers[index] == answer2[index % answer2.size]) {
                cnt2++
            }
            if (answers[index] == answer3[index % answer3.size]) {
                cnt3++
            }

        }


        max = cnt1.coerceAtLeast(cnt2)
        max = max.coerceAtLeast(cnt3)

        if (max == cnt1 && cnt1 == cnt2 && cnt2 == cnt3) {
            answer.add(1)
            answer.add(2)
            answer.add(3)
        } else if (max == cnt1 && cnt1 == cnt2) {
            answer.add(1)
            answer.add(2)
        } else if (max == cnt2 && cnt2 == cnt3) {
            answer.add(2)
            answer.add(3)
        } else if (max == cnt1 && cnt1 == cnt3) {
            answer.add(1)
            answer.add(3)
        } else {
            if (max == cnt1) {
                answer.add(1)
            } else if (max == cnt2) {
                answer.add(2)
            } else if (max == cnt3) {
                answer.add(3)
            }
        }


        return answer.toIntArray()
    }

}

fun main(args: Array<String>) {
    val math = Math()
    math.solution(intArrayOf(1, 2, 3, 4, 5))
}