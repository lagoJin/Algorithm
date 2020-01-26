package level2

import assertEquals
import java.util.*
import kotlin.collections.HashMap

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
                }
                queue.add(count - 1)
                count = 0
            }
        }

        println(queue.toString())
        val list = ArrayList<Int>()

        var day = 1

        return list.toIntArray()
    }

}

fun main() {

    val functionDevelop = FunctionDevelop()

    functionDevelop.solution(intArrayOf(55, 90, 30), intArrayOf(5, 1, 10)).assertEquals(intArrayOf(1, 2))
    functionDevelop.solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5)).assertEquals(intArrayOf(2, 1))

}