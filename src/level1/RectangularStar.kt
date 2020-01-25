package level1

class RectangularStar {


}

//https://programmers.co.kr/learn/courses/30/lessons/12969?language=kotlin
fun main() {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (i in 0 until b) {
        for (j in 0 until a) {
            print("*")
        }
        if (a != a - 1) println()
    }

}