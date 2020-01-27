package code_test

import assertEquals

class Braces {
    fun braces(values: Array<String>): Array<String> {

        val strings = ArrayList<String>()
        val length = values[0].toInt()
        for (i in 1..length) {
            val value = values[i]
            if (value.length % 2 != 0) {
                strings.add("NO")
            } else {
                val one = value.replace("[", "")
                val two = one.replace("]", "")
                val three = two.replace("{", "")
                val four = three.replace("}", "")
                val five = four.replace("(", "")
                val six = five.replace(")", "")
                if (six.isEmpty()) {
                    strings.add("YES")
                }
            }
        }
        return strings.toTypedArray()
    }

}

fun main(){
    val brace = Braces()
    brace.braces(arrayOf("2", "{}[]()", "{[}]}")).assertEquals(arrayOf("YES","NO"))
}