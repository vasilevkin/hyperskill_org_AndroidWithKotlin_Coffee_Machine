import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()

    val addition =
            if (number % 2 == 0) 2 else 1
    val nextNumber = number + addition

    print(nextNumber)
    // put your code here
}