package level2

import assertEquals
import java.util.*

class FunctionDevelop {

    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        val queue = LinkedList<Int>()

        var count = 0

        for (i in progresses.indices) {
            if (progresses[i] == speeds[i]) {
                queue.add(count + 1)
            } else {
                for (j in (progresses[i])..100 step speeds[i]) {
                    count++
                    if (j == 100) {
                        queue.add(count - 1)
                        count = 0
                    }
                }
            }
        }

        val list = ArrayList<Int>()
        println(queue.toString())

        var day = 1
        for (i in queue.indices) {
            if (i + 1 == queue.size) {
                list.add(1)
            } else {
                if (queue[i] > queue[i + 1]) {
                    day++
                } else {
                    list.add(day)
                    day = 1
                }
            }
        }

        return list.toIntArray()
    }

}

fun main() {

    val functionDevelop = FunctionDevelop()
    //functionDevelop.solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5)).assertEquals(intArrayOf(2, 1))
    functionDevelop.solution(intArrayOf(21, 25, 20), intArrayOf(5, 5, 5)).assertEquals(intArrayOf(3))

}