package greedy

import java.util.Scanner
import kotlin.collections.ArrayList

//https://www.acmicpc.net/problem/11399

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val people = nextInt()
    val peopleTime = Array(people) { nextInt() }

    var answer = 0
    peopleTime.sort()
    val list = ArrayList<Int>()

    var count = 0
    for (i in 0 until peopleTime.size) {
        count += peopleTime[i]
        list.add(count)
    }

    list.forEach {
        answer += it
    }

    print(answer)

}