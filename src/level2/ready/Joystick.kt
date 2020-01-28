package level2.ready

import assertEquals


//https://programmers.co.kr/learn/courses/30/lessons/42860
class Joystick {

    fun solution(name: String): Int {
        var answer = 0

        val english = getEnglish()

        var after = 0
        for (i in name.indices) {
            val index = english.indexOf(name[i].toString())
            if (i == 0) {
                answer += index
                after = index
            } else {


                after = index
            }
        }

        println(answer)



        return answer
    }

    fun getEnglish(): Array<String> {
        return arrayOf(
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z"
        )
    }


}

fun main() {

    val joystick = Joystick()
    joystick.solution("JEROEN").assertEquals(56)
    joystick.solution("JAN").assertEquals(23)
}