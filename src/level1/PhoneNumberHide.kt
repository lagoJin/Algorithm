package level1

import assertEquals

//https://programmers.co.kr/learn/courses/30/lessons/12948
class PhoneNumberHide {

    fun solution(phone_number: String): String {
        var answer = ""

        for (i in 0 until phone_number.length - 4) {
            answer += "*"
        }

        for (i in phone_number.length - 4 until phone_number.length) {
            answer += phone_number[i]
        }

        return answer
    }
}

fun main() {

    val phoneNumberHide = PhoneNumberHide()
    phoneNumberHide.solution("01033334444").assertEquals("*******4444")
    phoneNumberHide.solution("027778888").assertEquals("*****8888")

}