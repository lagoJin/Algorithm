package level1

//https://programmers.co.kr/learn/courses/30/lessons/12919
class KimSearch {

    fun solution(seoul: Array<String>): String {
        return "김서방은 ${seoul.indexOf("Kim")}에 있다"
    }

}

fun main() {

    val kimSearch = KimSearch()
    kimSearch.solution(arrayOf("Jane", "Kim"))

}