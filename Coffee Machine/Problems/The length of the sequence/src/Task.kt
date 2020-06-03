import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var numberOfElements = 0

    do {
        val number = scanner.nextInt()
        numberOfElements++
    } while (number != 0)

    print(numberOfElements - 1)

    // put your code here
}