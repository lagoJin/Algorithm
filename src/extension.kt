fun <T> T.assertEquals(value: T) {
    //val thread = Thread.currentThread().stackTrace[2]
    //println("method : ${thread.fileName} lineNUmber : ${thread.lineNumber}")

    if (this is IntArray && value is IntArray) {
        println("value : ${value.contentToString()} return : ${this.contentToString()}")
        println("result : ${this contentEquals value}")
    } else {
        println("value : $value return : $this")
        println("result : ${this == value}")
    }


}