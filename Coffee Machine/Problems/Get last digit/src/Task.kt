import java.util.*
import kotlin.math.absoluteValue


fun getLastDigit(a: Int): Int = (a % 10).absoluteValue

// write your code here

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}

