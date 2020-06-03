import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val c1 = scanner.next().single()
    val c2 = scanner.next().single()
    val c3 = scanner.next().single()

    val bool = c1 + 1 == c2 && c1 + 2 == c3

    print(bool)
//    print("$bool, $c1, $c2, $c3")
    // put your code here
}