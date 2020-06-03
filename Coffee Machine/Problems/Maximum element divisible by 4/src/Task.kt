import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var maxNumber = 0

    val quantity = scanner.nextInt()

    repeat(quantity) {
        val number = scanner.nextInt()
        if (number % 4 == 0 && number > maxNumber)
            maxNumber = number
    }

    print(maxNumber)

    // put your code here
}