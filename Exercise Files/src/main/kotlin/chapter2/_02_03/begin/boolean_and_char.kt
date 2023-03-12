package chapter2._02_03.begin

fun firstOperand(): Boolean {
    println("firstOperand")
    return false;
}

fun secondOperand(): Boolean {
    println("secondOperand")
    return true;
}

fun main() {
//    demoBoolean()
    demoChar()
}

private fun demoBoolean() {
}

private fun demoChar() {
    val letter: Char = 'A'
    val tab = '\t'
    val infinty = '\u221E'

    println("letter = $letter")
    println("tabbed $tab over")
    println("infity = $infinty")

    val lineFeed = 10.toChar()
    println("line feed = $lineFeed next line")
}
