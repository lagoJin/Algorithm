package code_test

import assertEquals

fun programmerStrings(s: String): Int {
    // Write your code here
    val programmer = "programmer"
    var localProgrammer = ""

    for (i in s.indices) {
        if (localProgrammer.length < 10) {
            localProgrammer += s[i]
        } else {
            if(localProgrammer.toList().containsAll(programmer.toList())){
                println("같음 $i")
            }
        }
    }


    return 0
}


fun main() {
    //programmerStrings("programmerprogrammer").assertEquals(0)
    programmerStrings("progxrwerammerrxproxgrammer").assertEquals(0)
    //programmerStrings("programmerprogrammer").assertEquals(0)
}