import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here

    val d1 = scanner.next().single()
    val d2 = scanner.next().single()
    val d3 = scanner.next().single()
    val d4 = scanner.next().single()

    print("${d1.isDigit()}\\${d2.isDigit()}\\${d3.isDigit()}\\${d4.isDigit()}")
}