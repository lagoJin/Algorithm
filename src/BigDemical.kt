class BigDemical {

    fun solution(numbers: IntArray): String {
        var answer = ""
        val arr = ArrayList<String>()

        for (i in 0 until numbers.size) {
            arr.add(numbers[i].toString())

            if (arr[0] == "0") return "0"

            arr.sortWith(Comparator { o1, o2 ->
                (o2 + o1).compareTo(o1 + o2)
            })
        }

        for (i in 0 until arr.size) {
            answer += arr[i]
        }

        return answer
    }

}

fun main() {
    val bigDemical = BigDemical()
    bigDemical.solution(intArrayOf(6, 2, 10))

}