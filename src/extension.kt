fun Int.assertEquals(value: Any) {
    val thread = Thread.currentThread().stackTrace[2]
    println("method : ${thread.fileName} lineNUmber : ${thread.lineNumber} result : ${this == value}")
}