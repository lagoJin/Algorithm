package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12950
class AddOfMatrix {

    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val list = ArrayList<IntArray>()

        for (i in arr1.indices) {
            val localList = ArrayList<Int>()

            for (x in arr2[i].indices) {
                localList.add(arr1[i][x] + arr2[i][x])
            }
            list.add(localList.toIntArray())
        }


        return list.toTypedArray()
    }

}

fun main() {

    val addOfMatrix = AddOfMatrix()
    addOfMatrix.solution(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)), arrayOf(intArrayOf(3, 4), intArrayOf(5, 6)))
        .assertEquals(
            arrayOf(intArrayOf(4, 6), intArrayOf(7, 9))
        )

    addOfMatrix.solution(arrayOf(intArrayOf(1), intArrayOf(2)), arrayOf(intArrayOf(3), intArrayOf(4)))
        .assertEquals(
            arrayOf(intArrayOf(4), intArrayOf(6))
        )

}