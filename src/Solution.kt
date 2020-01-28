import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap
import kotlin.system.exitProcess

/*
class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()

        arr.forEach {
            if(it.rem(divisor) == 0){
                answer += it
            }
        }

        if(answer.isEmpty()) {
            answer += -1
        }

        answer.sort()

        return answer
    }
}

fun greedy.level1.main(args : Array<String>) {
    val solution = Solution()
    val intArray = intArrayOf(2,36,1,3)
    solution.solution(intArray, 1)
}*/
/*

fun greedy.level1.main(args: Array<String>) {

    val test = intArrayOf(1,2,3,4,5)
    val sol = Solution()
    sol.solution(test)
}

    class Solution {
        fun solution(answers: IntArray): IntArray {
            var answer = intArrayOf()
            val personMap = LinkedHashMap<Pair<String, Int>, IntArray>()
            val people1 = Pair("1", 0)
            val people2 = Pair("2", 0)
            val people3 = Pair("3", 0)

            personMap[people1] = intArrayOf(1, 2, 3, 4, 5)
            personMap[people2] = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
            personMap[people3] = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)


            personMap.forEach { personMap2, cal ->
                var count = 0
                answers.forEachIndexed { index, i ->
                    var rawScore = 0
                    if (cal[index] == i) {
                        rawScore += 1
                    }

                    if (index % cal.size == 0) {
                        count = 0
                    }

                    if(answers.size-1 == index){
                         println(rawScore)
                    }
                    count += 1
                }
            }
            return answer
        }

}*/
/*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val list = ArrayList<Int>()
        val result = ArrayList<ArrayList<Int>>()
        var board2 = ArrayList<Int>()

        board.forEachIndexed { index, ints ->
            board2 = ArrayList<Int>()
            ints.forEachIndexed { index, i ->
                board2.add(i)
            }
            result.add(board2)
        }


        moves.forEach { i ->
            val position = i - 1
            list.add(result[position].last())
            result[position].removeAt(result[position].size-1)

            if(list.isEmpty() && list.size > 1){
                if(list[list.size-1] == list[list.size-2]){
                    list.removeAt(list.size-1)
                    list.removeAt(list.size-2)

                    answer += 1
                }
            }
        }
        return answer
    }
}*/

interface StackImplement<Type> {

    fun count(): Int
    fun pop(): Type?
    fun peek(): Type?
    fun push(item: Type)
    fun isEmpty(): Boolean

}

class Stack : StackImplement<Int> {

    val list = mutableListOf<Int>()

    override fun count(): Int {
        return list.size
    }

    override fun pop(): Int? {
        if (!isEmpty()) {
            return list.removeAt(list.size - 1)
        }
        return null
    }

    override fun peek(): Int? {
        if (!isEmpty()) {
            val item = list[list.size - 1]
            return item
        }
        return null
    }

    override fun push(item: Int) {
        list.add(item)
    }

    override fun isEmpty(): Boolean {
        return list.size == 0
    }
}

interface QueueImplement<Type> {

    fun enqueue(item: Type)
    fun dequeue(): Type?
    fun count(): Int
    fun peek(): Type?
    fun isEmpty(): Boolean

}

class Queue : QueueImplement<Int> {
    var list = mutableListOf<Int>()

    override fun enqueue(item: Int) {
        list.add(item)
    }

    override fun dequeue(): Int? {
        if (!isEmpty()) {
            val value = list.first()
            list.remove(list.first())
            return value
        }
        return null
    }

    override fun count(): Int {
        return list.size
    }

    override fun peek(): Int? {
        if (!isEmpty()) {
            return list[list.size - 1]
        }
        return null
    }

    override fun isEmpty(): Boolean {
        return list.size == 0
    }
}