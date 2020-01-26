class GymCloths {

    fun equalValue(lost: IntArray, reserve: IntArray): ArrayList<Int> {
        val list = ArrayList<Int>()

        if (lost.size >= reserve.size) {
            for (i in reserve.indices) {
                for (element in lost) {
                    if (element == reserve[i]) {
                        list.add(reserve[i])
                    }
                }
            }
        } else if (lost.size < reserve.size) {
            for (i in lost.indices) {
                for (element in reserve) {
                    if (lost[i] == element) {
                        list.add(lost[i])
                    }
                }
            }
        }

        return list
    }

    fun solution2(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n - lost.size

        val lostList = lost.toCollection(ArrayList())
        val reserveList = reserve.toCollection(ArrayList())

        val equalList = equalValue(lost, reserve)

        if (equalList.size == n) return equalList.size

        lostList.removeAll(equalList)
        reserveList.removeAll(equalList)

        var count = equalList.size
        equalList.clear()

        for (i in 0 until lostList.size) {
            for (j in reserveList.indices) {
                val before = reserveList[j] - 1
                val after = reserveList[j] + 1

                if (before == lostList[i] || after == lostList[i]) {
                    if (equalList.contains(reserveList[j])) {
                        break
                    }
                    equalList.add(reserveList[j])
                    count += 1
                }
            }
        }
        answer += count
        return answer
    }

    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {

        var answer = n
        val lostSet = lost.toSet() - reserve.toSet()
        val reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

        for (i in lostSet) {
            when {
                i + 1 in reserveSet -> reserveSet.remove(i + 1)
                i - 1 in reserveSet -> reserveSet.remove(i - 1)
                else -> answer--
            }
        }
        return answer

    }

}

fun main() {

    val gymCloths = GymCloths()

    gymCloths.equalValue(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)).size
        .assertEquals(3)
    gymCloths.equalValue(intArrayOf(1, 2, 4), intArrayOf(1, 2, 3)).size
        .assertEquals(2)
    gymCloths.equalValue(intArrayOf(2, 3, 5, 9), intArrayOf(2, 3)).size
        .assertEquals(2)
    gymCloths.equalValue(
        intArrayOf(2, 3, 4, 5, 9),
        intArrayOf(2, 4, 5)
    ).size.assertEquals(3)
    gymCloths.solution(4, intArrayOf(1, 2, 4), intArrayOf(1, 2, 3)).assertEquals(4)
    gymCloths.solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)).assertEquals(5)
    gymCloths.solution(5, intArrayOf(2, 4), intArrayOf(3)).assertEquals(4)
    gymCloths.solution(3, intArrayOf(3), intArrayOf(1)).assertEquals(2)
    gymCloths.solution(3, intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)).assertEquals(3)
    gymCloths.solution(7, intArrayOf(1, 3, 5), intArrayOf(2, 3, 6)).assertEquals(7)

}



private fun buildLogMsg(message: String): String {

    val ste: StackTraceElement = Thread.currentThread().stackTrace[4]
    val stb = StringBuilder()

    stb.append("[")
    stb.append(ste.fileName.replace("kt", ""))
    stb.append("::")
    stb.append(ste.methodName)
    stb.append("]")
    stb.append(message)

    return stb.toString()
}


